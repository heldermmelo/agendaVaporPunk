package br.com.helder.agendafinal.Modelo;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Helder on 28/11/2017.
 */

public class Data implements Parcelable {
    private Date mData;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mData.toString());
    }

    public static final Parcelable.Creator<Data> CREATOR
            = new Parcelable.Creator<Data>() {
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

 //   private Data(Parcel in) {
        ArrayList<Parcel> md=new ArrayList(in.readSize(),in);
    }
//}
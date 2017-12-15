package ninja.esgi.tpfinal.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by roland on 15/12/2017.
 */

public class User implements Parcelable {
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;


    public User(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        email = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(email);
    }
}

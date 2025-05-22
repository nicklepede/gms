package com.google.android.gms.gcm;

import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.atzb;
import java.util.Collections;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public abstract class Task implements ReflectedParcelable {
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    @Deprecated
    public Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        String readString = parcel.readString();
        this.c = readString;
        String readString2 = parcel.readString();
        this.d = readString2;
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1;
        Set set = Collections.EMPTY_SET;
        atzb.c(readString != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
        if (TextUtils.isEmpty(readString2)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if (readString2.length() > 100) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}

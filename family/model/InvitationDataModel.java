package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.asqx;
import defpackage.azru;
import defpackage.eiig;
import defpackage.epue;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class InvitationDataModel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new azru();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final int g;

    public InvitationDataModel(String str, String str2, String str3, String str4, String str5, int i, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.g = i;
        this.f = l;
    }

    public final String a() {
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = this.d;
        return !TextUtils.isEmpty(str2) ? str2 : asqx.c(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        parcel.writeString(str);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(str);
        parcel.writeInt(this.g - 1);
        parcel.writeLong(this.f.longValue());
    }

    public InvitationDataModel(Parcel parcel) {
        String readString = parcel.readString();
        eiig.x(readString);
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        int a = epue.a(parcel.readInt());
        this.g = a == 0 ? 1 : a;
        this.f = Long.valueOf(parcel.readLong());
    }
}

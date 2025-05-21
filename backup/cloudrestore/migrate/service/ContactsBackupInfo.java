package com.google.android.gms.backup.cloudrestore.migrate.service;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ahnk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ContactsBackupInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ahnk();
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String[] f;
    public String[] g;
    private String h;

    public ContactsBackupInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.h);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeStringArray(this.f);
        parcel.writeStringArray(this.g);
    }

    public ContactsBackupInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public ContactsBackupInfo(String str, String str2, String str3, int i, int i2, int i3, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = str2;
        this.h = str3;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = strArr;
        this.g = strArr2;
    }

    public ContactsBackupInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.h = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.createStringArray();
        this.g = parcel.createStringArray();
    }
}

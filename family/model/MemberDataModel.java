package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.azrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class MemberDataModel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new azrv();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public int g;
    public final boolean h;
    public long i;
    public int j;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r0.equals("UNSUPERVISED") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MemberDataModel(android.os.Parcel r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = r6.readString()
            defpackage.eiig.x(r0)
            r5.a = r0
            java.lang.String r0 = r6.readString()
            r5.b = r0
            java.lang.String r0 = r6.readString()
            r5.c = r0
            java.lang.String r0 = r6.readString()
            r5.d = r0
            java.lang.String r0 = r6.readString()
            r5.e = r0
            java.lang.String r0 = r6.readString()
            r5.f = r0
            int r0 = r6.readInt()
            r5.g = r0
            int r0 = r6.readInt()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L3a
            r0 = r2
            goto L3b
        L3a:
            r0 = r1
        L3b:
            r5.h = r0
            java.lang.String r0 = r6.readString()
            defpackage.eiig.x(r0)
            int r3 = r0.hashCode()
            r4 = -1553293955(0xffffffffa36a9d7d, float:-1.2718515E-17)
            if (r3 == r4) goto L5d
            r1 = -1212137948(0xffffffffb7c03e24, float:-2.291712E-5)
            if (r3 == r1) goto L53
            goto L66
        L53:
            java.lang.String r1 = "SUPERVISED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L66
            r1 = r2
            goto L67
        L5d:
            java.lang.String r3 = "UNSUPERVISED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L66
            goto L67
        L66:
            r1 = -1
        L67:
            if (r1 == 0) goto L73
            if (r1 != r2) goto L6d
            r2 = 2
            goto L73
        L6d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L73:
            r5.j = r2
            long r0 = r6.readLong()
            r5.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.family.model.MemberDataModel.<init>(android.os.Parcel):void");
    }

    public final boolean a() {
        return this.j != 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        int i2 = this.j;
        String str = i2 != 1 ? i2 != 2 ? "null" : "SUPERVISED" : "UNSUPERVISED";
        if (i2 == 0) {
            throw null;
        }
        parcel.writeString(str);
        parcel.writeLong(this.i);
    }

    public MemberDataModel(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, int i2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = z;
        this.j = i2;
        this.i = l.longValue();
    }
}

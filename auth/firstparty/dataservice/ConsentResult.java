package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acye;
import defpackage.aczm;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConsentResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new acye();
    public static final String a = "com.google.android.gms.auth.firstparty.dataservice.ConsentResult";
    public final int b;
    public final String c;
    public final String d;
    public final FACLConfig e;
    public final String f;
    public final String g;
    public final String h;

    public ConsentResult(int i, String str, String str2, FACLConfig fACLConfig, String str3, String str4, String str5) {
        this.b = i;
        atzb.s(str);
        this.c = str;
        this.d = str2;
        this.e = fACLConfig;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final aczm a() {
        return aczm.a(this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.c, false);
        atzr.v(parcel, 3, this.d, false);
        atzr.t(parcel, 4, this.e, i, false);
        atzr.v(parcel, 5, this.f, false);
        atzr.v(parcel, 6, this.g, false);
        atzr.v(parcel, 7, this.h, false);
        atzr.c(parcel, a2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConsentResult(defpackage.adau r9, java.lang.String r10, com.google.android.gms.auth.firstparty.shared.FACLConfig r11, defpackage.aczm r12, java.lang.String r13) {
        /*
            r8 = this;
            defpackage.atzb.s(r9)
            java.lang.String r2 = r9.toString()
            defpackage.atzb.s(r12)
            java.lang.String r5 = r12.toString()
            r7 = 0
            r1 = 3
            r0 = r8
            r3 = r10
            r4 = r11
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.firstparty.dataservice.ConsentResult.<init>(adau, java.lang.String, com.google.android.gms.auth.firstparty.shared.FACLConfig, aczm, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConsentResult(defpackage.adau r9, defpackage.aczm r10, java.lang.String r11) {
        /*
            r8 = this;
            defpackage.atzb.s(r9)
            java.lang.String r2 = r9.toString()
            defpackage.atzb.s(r10)
            java.lang.String r5 = r10.toString()
            r6 = 0
            r1 = 3
            r3 = 0
            r4 = 0
            r0 = r8
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.firstparty.dataservice.ConsentResult.<init>(adau, aczm, java.lang.String):void");
    }
}

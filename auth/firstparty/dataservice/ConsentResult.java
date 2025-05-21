package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaye;
import defpackage.aazm;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ConsentResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new aaye();
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
        arwm.s(str);
        this.c = str;
        this.d = str2;
        this.e = fACLConfig;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final aazm a() {
        return aazm.a(this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.c, false);
        arxc.v(parcel, 3, this.d, false);
        arxc.t(parcel, 4, this.e, i, false);
        arxc.v(parcel, 5, this.f, false);
        arxc.v(parcel, 6, this.g, false);
        arxc.v(parcel, 7, this.h, false);
        arxc.c(parcel, a2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConsentResult(defpackage.abau r9, java.lang.String r10, com.google.android.gms.auth.firstparty.shared.FACLConfig r11, defpackage.aazm r12, java.lang.String r13) {
        /*
            r8 = this;
            defpackage.arwm.s(r9)
            java.lang.String r2 = r9.toString()
            defpackage.arwm.s(r12)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.firstparty.dataservice.ConsentResult.<init>(abau, java.lang.String, com.google.android.gms.auth.firstparty.shared.FACLConfig, aazm, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConsentResult(defpackage.abau r9, defpackage.aazm r10, java.lang.String r11) {
        /*
            r8 = this;
            defpackage.arwm.s(r9)
            java.lang.String r2 = r9.toString()
            defpackage.arwm.s(r10)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.firstparty.dataservice.ConsentResult.<init>(abau, aazm, java.lang.String):void");
    }
}

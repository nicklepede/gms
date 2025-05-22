package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.asem;
import defpackage.atyq;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asem();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (atyq.b(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && atyq.b(this.f, playLoggerContext.f) && atyq.b(this.d, playLoggerContext.d) && this.e == playLoggerContext.e && this.g == playLoggerContext.g && this.h == playLoggerContext.h && atyq.b(this.i, playLoggerContext.i) && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.v(parcel, 5, this.d, false);
        atzr.e(parcel, 7, this.e);
        atzr.v(parcel, 8, this.f, false);
        atzr.e(parcel, 9, this.g);
        atzr.o(parcel, 10, this.h);
        atzr.F(parcel, 11, this.i);
        atzr.e(parcel, 12, this.j);
        atzr.o(parcel, 13, this.k);
        atzr.c(parcel, a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlayLoggerContext(java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, defpackage.fkuc r19, java.lang.Integer r20, boolean r21, defpackage.arxd r22) {
        /*
            r14 = this;
            r0 = r22
            arxe r1 = defpackage.arxe.ANDROID_ID
            boolean r7 = r0.a(r1)
            arxd r1 = defpackage.arxd.b
            boolean r9 = r0.equals(r1)
            r1 = r19
            int r10 = r1.f
            arxd r1 = defpackage.arxd.a
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1d
            r0 = 0
            r13 = r0
            goto L36
        L1d:
            elhz r0 = r0.d
            elsn r0 = r0.listIterator()
            r1 = -1
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r0.next()
            arxe r2 = (defpackage.arxe) r2
            int r2 = r2.e
            int r2 = ~r2
            r1 = r1 & r2
            goto L24
        L35:
            r13 = r1
        L36:
            r5 = -1
            r2 = r14
            r3 = r15
            r4 = r16
            r8 = r17
            r6 = r18
            r11 = r20
            r12 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.internal.PlayLoggerContext.<init>(java.lang.String, int, java.lang.String, java.lang.String, fkuc, java.lang.Integer, boolean, arxd):void");
    }
}

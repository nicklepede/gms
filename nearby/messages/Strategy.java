package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arxc;
import defpackage.ckal;
import defpackage.ckam;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckam();
    public static final Strategy a = new ckal().a();

    @Deprecated
    public static final Strategy b;
    final int c;

    @Deprecated
    final int d;
    public final int e;
    public final int f;

    @Deprecated
    final boolean g;
    public final int h;
    public final int i;
    public final int j;

    static {
        ckal ckalVar = new ckal();
        ckalVar.c = 2;
        ckalVar.b(Integer.MAX_VALUE);
        b = ckalVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Strategy(int r2, int r3, int r4, int r5, boolean r6, int r7, int r8, int r9) {
        /*
            r1 = this;
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r2 = 1
            r0 = 2
            if (r3 != 0) goto Le
        Lb:
            r1.i = r8
            goto L19
        Le:
            if (r3 == r0) goto L17
            r8 = 3
            if (r3 == r8) goto L14
            goto Lb
        L14:
            r1.i = r0
            goto L19
        L17:
            r1.i = r2
        L19:
            r1.f = r5
            r1.g = r6
            if (r6 == 0) goto L27
            r1.h = r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.e = r2
            goto L38
        L27:
            r1.e = r4
            r3 = -1
            if (r7 == r3) goto L36
            if (r7 == 0) goto L36
            if (r7 == r2) goto L36
            r2 = 6
            if (r7 == r2) goto L36
            r1.h = r7
            goto L38
        L36:
            r1.h = r3
        L38:
            r1.j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.Strategy.<init>(int, int, int, int, boolean, int, int, int):void");
    }

    public final boolean a() {
        return (this.i & 1) != 0;
    }

    public final boolean b() {
        return (this.i & 2) != 0;
    }

    public final boolean c() {
        return (this.h & 2) != 0;
    }

    public final boolean d() {
        return this.h == -1;
    }

    @Deprecated
    public final boolean e() {
        return (this.h & 4) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.c == strategy.c && this.i == strategy.i && this.e == strategy.e && this.f == strategy.f && this.h == strategy.h && this.j == strategy.j;
    }

    public final int hashCode() {
        return (((((((((this.c * 31) + this.i) * 31) + this.e) * 31) + this.f) * 31) + this.h) * 31) + this.j;
    }

    public final String toString() {
        String j;
        String j2;
        int i = this.f;
        String j3 = i != 0 ? i != 1 ? a.j(i, "UNKNOWN:") : "EARSHOT" : "DEFAULT";
        int i2 = this.h;
        if (i2 == -1) {
            j = "DEFAULT";
        } else {
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) > 0) {
                arrayList.add("ULTRASOUND");
            }
            if ((i2 & 2) > 0) {
                arrayList.add("BLE");
            }
            j = arrayList.isEmpty() ? a.j(i2, "UNKNOWN:") : arrayList.toString();
        }
        int i3 = this.i;
        if (i3 == 3) {
            j2 = "DEFAULT";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if ((i3 & 1) > 0) {
                arrayList2.add("BROADCAST");
            }
            if ((i3 & 2) > 0) {
                arrayList2.add("SCAN");
            }
            j2 = arrayList2.isEmpty() ? a.j(i3, "UNKNOWN:") : arrayList2.toString();
        }
        int i4 = this.j;
        String j4 = i4 != 0 ? i4 != 1 ? a.j(i4, "UNKNOWN: ") : "ALWAYS_ON" : "DEFAULT";
        return "Strategy{ttlSeconds=" + this.e + ", distanceType=" + j3 + ", discoveryMedium=" + j + ", discoveryMode=" + j2 + ", backgroundScanMode=" + j4 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, this.d);
        arxc.o(parcel, 2, this.e);
        arxc.o(parcel, 3, this.f);
        arxc.e(parcel, 4, this.g);
        arxc.o(parcel, 5, this.h);
        arxc.o(parcel, 6, this.i);
        arxc.o(parcel, 7, this.j);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.c);
        arxc.c(parcel, a2);
    }
}

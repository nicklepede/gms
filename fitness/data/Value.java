package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgek;
import defpackage.bry;
import java.util.Arrays;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Value extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgek();
    public final int a;
    public boolean b;
    public float c;
    public String d;
    public Map e;
    public int[] f;
    public float[] g;
    public byte[] h;

    public Value(int i) {
        this(i, false, 0.0f, null, null, null, null, null);
    }

    public final int a() {
        arwm.m(this.a == 1, "Value is not in int format");
        return Float.floatToRawIntBits(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        int i = this.a;
        if (i != value.a || this.b != value.b) {
            return false;
        }
        if (i != 1) {
            if (i == 3) {
                return arwb.b(this.d, value.d);
            }
            if (i == 4) {
                return arwb.b(this.e, value.e);
            }
            if (i == 5) {
                return Arrays.equals(this.f, value.f);
            }
            if (i == 6) {
                return Arrays.equals(this.g, value.g);
            }
            if (i == 7) {
                return Arrays.equals(this.h, value.h);
            }
            if (this.c != value.c) {
                return false;
            }
        } else if (a() != value.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c), this.d, this.e, this.f, this.g, this.h});
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r12 = this;
            boolean r0 = r12.b
            if (r0 != 0) goto L7
            java.lang.String r0 = "unset"
            return r0
        L7:
            int r0 = r12.a
            java.lang.String r1 = ""
            switch(r0) {
                case 1: goto Lb9;
                case 2: goto Lb2;
                case 3: goto Lac;
                case 4: goto L9d;
                case 5: goto L96;
                case 6: goto L8f;
                case 7: goto L11;
                default: goto Le;
            }
        Le:
            java.lang.String r0 = "unknown"
            return r0
        L11:
            byte[] r0 = r12.h
            if (r0 != 0) goto L16
            return r1
        L16:
            int r2 = r0.length
            if (r2 == 0) goto L8a
            int r3 = r2 + 15
            r4 = 16
            int r3 = r3 / r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 * 57
            r5.<init>(r3)
            r3 = 0
            r6 = r2
            r7 = r3
            r8 = r7
        L29:
            if (r6 <= 0) goto L85
            r9 = 1
            if (r7 != 0) goto L56
            r10 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r10) goto L44
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r3] = r10
            java.lang.String r10 = "%04X:"
            java.lang.String r10 = java.lang.String.format(r10, r11)
            r5.append(r10)
            goto L5f
        L44:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r3] = r10
            java.lang.String r10 = "%08X:"
            java.lang.String r10 = java.lang.String.format(r10, r11)
            r5.append(r10)
            goto L5f
        L56:
            r10 = 8
            if (r7 != r10) goto L5f
            java.lang.String r10 = " -"
            r5.append(r10)
        L5f:
            r10 = r0[r8]
            r10 = r10 & 255(0xff, float:3.57E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r3] = r10
            java.lang.String r10 = " %02X"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r5.append(r9)
            int r6 = r6 + (-1)
            int r7 = r7 + 1
            if (r7 == r4) goto L7c
            if (r6 != 0) goto L82
        L7c:
            r7 = 10
            r5.append(r7)
            r7 = r3
        L82:
            int r8 = r8 + 1
            goto L29
        L85:
            java.lang.String r0 = r5.toString()
            goto L8b
        L8a:
            r0 = 0
        L8b:
            if (r0 != 0) goto L8e
            goto Lb0
        L8e:
            return r0
        L8f:
            float[] r0 = r12.g
            java.lang.String r0 = java.util.Arrays.toString(r0)
            return r0
        L96:
            int[] r0 = r12.f
            java.lang.String r0 = java.util.Arrays.toString(r0)
            return r0
        L9d:
            java.util.Map r0 = r12.e
            if (r0 != 0) goto La2
            return r1
        La2:
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>(r0)
            java.lang.String r0 = r1.toString()
            return r0
        Lac:
            java.lang.String r0 = r12.d
            if (r0 != 0) goto Lb1
        Lb0:
            return r1
        Lb1:
            return r0
        Lb2:
            float r0 = r12.c
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
        Lb9:
            int r0 = r12.a()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.data.Value.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.e(parcel, 2, this.b);
        arxc.l(parcel, 3, this.c);
        arxc.v(parcel, 4, this.d, false);
        Map map = this.e;
        if (map == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle(map.size());
            for (Map.Entry entry : this.e.entrySet()) {
                bundle2.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
            }
            bundle = bundle2;
        }
        arxc.g(parcel, 5, bundle, false);
        arxc.p(parcel, 6, this.f, false);
        arxc.m(parcel, 7, this.g, false);
        arxc.i(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }

    public Value(int i, boolean z, float f, String str, Bundle bundle, int[] iArr, float[] fArr, byte[] bArr) {
        bry bryVar;
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = str;
        if (bundle == null) {
            bryVar = null;
        } else {
            ClassLoader classLoader = MapValue.class.getClassLoader();
            arwm.s(classLoader);
            bundle.setClassLoader(classLoader);
            bryVar = new bry(bundle.size());
            for (String str2 : bundle.keySet()) {
                MapValue mapValue = (MapValue) bundle.getParcelable(str2);
                arwm.s(mapValue);
                bryVar.put(str2, mapValue);
            }
        }
        this.e = bryVar;
        this.f = iArr;
        this.g = fArr;
        this.h = bArr;
    }
}

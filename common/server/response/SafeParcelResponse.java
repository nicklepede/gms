package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxa;
import defpackage.arxb;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.asij;
import defpackage.asni;
import defpackage.asnj;
import defpackage.aspq;
import defpackage.asps;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new asij();
    public final int a;
    private final Parcel b;
    private final int c;
    private final FieldMappingDictionary d;
    private final String e;
    private int f;
    private int g;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.a = i;
        arwm.s(parcel);
        this.b = parcel;
        this.c = 2;
        this.d = fieldMappingDictionary;
        this.e = fieldMappingDictionary == null ? null : fieldMappingDictionary.b;
        this.f = 2;
    }

    private final void q(FastJsonResponse$Field fastJsonResponse$Field) {
        if (fastJsonResponse$Field.g == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.g = arxc.a(parcel);
            this.f = 1;
        }
    }

    private final void r(StringBuilder sb, Map map, Parcel parcel) {
        BigInteger[] bigIntegerArr;
        BigDecimal[] bigDecimalArr;
        Parcel[] parcelArr;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse$Field) entry.getValue()).g, entry);
        }
        sb.append('{');
        int h = arxb.h(parcel);
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get(arxb.d(readInt));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (fastJsonResponse$Field.k != null) {
                    int i = fastJsonResponse$Field.d;
                    switch (i) {
                        case 0:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, Integer.valueOf(arxb.f(parcel, readInt))));
                            break;
                        case 1:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, arxb.u(parcel, readInt)));
                            break;
                        case 2:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, Long.valueOf(arxb.i(parcel, readInt))));
                            break;
                        case 3:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, Float.valueOf(arxb.c(parcel, readInt))));
                            break;
                        case 4:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, Double.valueOf(arxb.b(parcel, readInt))));
                            break;
                        case 5:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, arxb.t(parcel, readInt)));
                            break;
                        case 6:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, Boolean.valueOf(arxb.D(parcel, readInt))));
                            break;
                        case 7:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, arxb.s(parcel, readInt)));
                            break;
                        case 8:
                        case 9:
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, arxb.E(parcel, readInt)));
                            break;
                        case 10:
                            Bundle j = arxb.j(parcel, readInt);
                            HashMap hashMap = new HashMap();
                            for (String str2 : j.keySet()) {
                                String string = j.getString(str2);
                                arwm.s(string);
                                hashMap.put(str2, string);
                            }
                            t(sb, fastJsonResponse$Field, ah(fastJsonResponse$Field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.j(i, "Unknown field out type = "));
                    }
                } else if (fastJsonResponse$Field.e) {
                    sb.append("[");
                    switch (fastJsonResponse$Field.d) {
                        case 0:
                            int[] H = arxb.H(parcel, readInt);
                            int length = H.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 != 0) {
                                    sb.append(",");
                                }
                                sb.append(H[i2]);
                            }
                            break;
                        case 1:
                            int g = arxb.g(parcel, readInt);
                            int dataPosition = parcel.dataPosition();
                            if (g == 0) {
                                bigIntegerArr = null;
                            } else {
                                int readInt2 = parcel.readInt();
                                bigIntegerArr = new BigInteger[readInt2];
                                for (int i3 = 0; i3 < readInt2; i3++) {
                                    bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
                                }
                                parcel.setDataPosition(dataPosition + g);
                            }
                            asni.c(sb, bigIntegerArr);
                            break;
                        case 2:
                            long[] I = arxb.I(parcel, readInt);
                            int length2 = I.length;
                            for (int i4 = 0; i4 < length2; i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(I[i4]);
                            }
                            break;
                        case 3:
                            float[] G = arxb.G(parcel, readInt);
                            int length3 = G.length;
                            for (int i5 = 0; i5 < length3; i5++) {
                                if (i5 != 0) {
                                    sb.append(",");
                                }
                                sb.append(G[i5]);
                            }
                            break;
                        case 4:
                            double[] F = arxb.F(parcel, readInt);
                            int length4 = F.length;
                            for (int i6 = 0; i6 < length4; i6++) {
                                if (i6 != 0) {
                                    sb.append(",");
                                }
                                sb.append(F[i6]);
                            }
                            break;
                        case 5:
                            int g2 = arxb.g(parcel, readInt);
                            int dataPosition2 = parcel.dataPosition();
                            if (g2 == 0) {
                                bigDecimalArr = null;
                            } else {
                                int readInt3 = parcel.readInt();
                                bigDecimalArr = new BigDecimal[readInt3];
                                for (int i7 = 0; i7 < readInt3; i7++) {
                                    bigDecimalArr[i7] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
                                }
                                parcel.setDataPosition(dataPosition2 + g2);
                            }
                            asni.c(sb, bigDecimalArr);
                            break;
                        case 6:
                            boolean[] L = arxb.L(parcel, readInt);
                            int length5 = L.length;
                            for (int i8 = 0; i8 < length5; i8++) {
                                if (i8 != 0) {
                                    sb.append(",");
                                }
                                sb.append(L[i8]);
                            }
                            break;
                        case 7:
                            String[] K = arxb.K(parcel, readInt);
                            int length6 = K.length;
                            for (int i9 = 0; i9 < length6; i9++) {
                                if (i9 != 0) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(K[i9]);
                                sb.append("\"");
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            int g3 = arxb.g(parcel, readInt);
                            int dataPosition3 = parcel.dataPosition();
                            if (g3 == 0) {
                                parcelArr = null;
                            } else {
                                int readInt4 = parcel.readInt();
                                Parcel[] parcelArr2 = new Parcel[readInt4];
                                for (int i10 = 0; i10 < readInt4; i10++) {
                                    int readInt5 = parcel.readInt();
                                    if (readInt5 != 0) {
                                        int dataPosition4 = parcel.dataPosition();
                                        Parcel obtain = Parcel.obtain();
                                        obtain.appendFrom(parcel, dataPosition4, readInt5);
                                        parcelArr2[i10] = obtain;
                                        parcel.setDataPosition(dataPosition4 + readInt5);
                                    } else {
                                        parcelArr2[i10] = null;
                                    }
                                }
                                parcel.setDataPosition(dataPosition3 + g3);
                                parcelArr = parcelArr2;
                            }
                            int length7 = parcelArr.length;
                            for (int i11 = 0; i11 < length7; i11++) {
                                if (i11 > 0) {
                                    sb.append(",");
                                }
                                parcelArr[i11].setDataPosition(0);
                                r(sb, fastJsonResponse$Field.c(), parcelArr[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (fastJsonResponse$Field.d) {
                        case 0:
                            sb.append(arxb.f(parcel, readInt));
                            break;
                        case 1:
                            sb.append(arxb.u(parcel, readInt));
                            break;
                        case 2:
                            sb.append(arxb.i(parcel, readInt));
                            break;
                        case 3:
                            sb.append(arxb.c(parcel, readInt));
                            break;
                        case 4:
                            sb.append(arxb.b(parcel, readInt));
                            break;
                        case 5:
                            sb.append(arxb.t(parcel, readInt));
                            break;
                        case 6:
                            sb.append(arxb.D(parcel, readInt));
                            break;
                        case 7:
                            String s = arxb.s(parcel, readInt);
                            sb.append("\"");
                            sb.append(aspq.a(s));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] E = arxb.E(parcel, readInt);
                            sb.append("\"");
                            sb.append(asnj.a(E));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] E2 = arxb.E(parcel, readInt);
                            sb.append("\"");
                            sb.append(asnj.b(E2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle j2 = arxb.j(parcel, readInt);
                            Set<String> keySet = j2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String str3 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(aspq.a(j2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel l = arxb.l(parcel, readInt);
                            l.setDataPosition(0);
                            r(sb, fastJsonResponse$Field.c(), l);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != h) {
            throw new arxa(a.j(h, "Overread allowed size end="), parcel);
        }
        sb.append('}');
    }

    private static final void s(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                arwm.s(obj);
                sb.append(aspq.a(obj.toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(asnj.a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(asnj.b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                arwm.s(obj);
                asps.a(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.j(i, "Unknown type = "));
        }
    }

    private static final void t(StringBuilder sb, FastJsonResponse$Field fastJsonResponse$Field, Object obj) {
        if (!fastJsonResponse$Field.c) {
            s(sb, fastJsonResponse$Field.b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            s(sb, fastJsonResponse$Field.b, arrayList.get(i));
        }
        sb.append("]");
    }

    @Override // defpackage.ashs
    protected final void B(FastJsonResponse$Field fastJsonResponse$Field, String str, BigDecimal bigDecimal) {
        q(fastJsonResponse$Field);
        arxc.d(this.b, fastJsonResponse$Field.g, bigDecimal, true);
    }

    @Override // defpackage.ashs
    protected final void D(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (BigDecimal) arrayList.get(i);
        }
        Parcel parcel = this.b;
        int b = arxc.b(parcel, fastJsonResponse$Field.g);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i2].scale());
        }
        arxc.c(parcel, b);
    }

    @Override // defpackage.ashs
    protected final void F(FastJsonResponse$Field fastJsonResponse$Field, String str, BigInteger bigInteger) {
        q(fastJsonResponse$Field);
        Parcel parcel = this.b;
        int i = fastJsonResponse$Field.g;
        if (bigInteger == null) {
            arxc.n(parcel, i, 0);
            return;
        }
        int b = arxc.b(parcel, i);
        parcel.writeByteArray(bigInteger.toByteArray());
        arxc.c(parcel, b);
    }

    @Override // defpackage.ashs
    protected final void H(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (BigInteger) arrayList.get(i);
        }
        Parcel parcel = this.b;
        int b = arxc.b(parcel, fastJsonResponse$Field.g);
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(bigIntegerArr[i2].toByteArray());
        }
        arxc.c(parcel, b);
    }

    @Override // defpackage.ashs
    protected final void K(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
        }
        arxc.f(this.b, fastJsonResponse$Field.g, zArr, true);
    }

    @Override // defpackage.ashs
    protected final void P(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        q(fastJsonResponse$Field);
        arxc.j(this.b, fastJsonResponse$Field.g, d);
    }

    @Override // defpackage.ashs
    protected final void R(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        arxc.k(this.b, fastJsonResponse$Field.g, dArr, true);
    }

    @Override // defpackage.ashs
    protected final void T(FastJsonResponse$Field fastJsonResponse$Field, String str, float f) {
        q(fastJsonResponse$Field);
        arxc.l(this.b, fastJsonResponse$Field.g, f);
    }

    @Override // defpackage.ashs
    protected final void V(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((Float) arrayList.get(i)).floatValue();
        }
        arxc.m(this.b, fastJsonResponse$Field.g, fArr, true);
    }

    @Override // defpackage.ashs
    protected final void Y(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
        }
        arxc.p(this.b, fastJsonResponse$Field.g, iArr, true);
    }

    @Override // defpackage.ashs
    protected final void ab(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        arxc.r(this.b, fastJsonResponse$Field.g, jArr, true);
    }

    @Override // defpackage.ashs
    protected final void ae(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        q(fastJsonResponse$Field);
        Bundle bundle = new Bundle();
        arwm.s(map);
        for (String str2 : map.keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        arxc.g(this.b, fastJsonResponse$Field.g, bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, defpackage.ashs
    public final boolean ag(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // defpackage.ashs
    public final Map b() {
        FieldMappingDictionary fieldMappingDictionary = this.d;
        if (fieldMappingDictionary == null) {
            return null;
        }
        String str = this.e;
        arwm.s(str);
        return fieldMappingDictionary.a(str);
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        q(fastJsonResponse$Field);
        arxc.v(this.b, fastJsonResponse$Field.g, str2, true);
    }

    @Override // defpackage.ashs
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        q(fastJsonResponse$Field);
        arxc.i(this.b, fastJsonResponse$Field.g, bArr, true);
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        q(fastJsonResponse$Field);
        arxc.e(this.b, fastJsonResponse$Field.g, z);
    }

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        ArrayList arrayList2 = new ArrayList();
        arwm.s(arrayList);
        arrayList.size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((SafeParcelResponse) ((ashs) arrayList.get(i))).p());
        }
        Parcel parcel = this.b;
        int b = arxc.b(parcel, fastJsonResponse$Field.g);
        int size2 = arrayList2.size();
        parcel.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            Parcel parcel2 = (Parcel) arrayList2.get(i2);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        arxc.c(parcel, b);
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        q(fastJsonResponse$Field);
        arxc.s(this.b, fastJsonResponse$Field.g, ((SafeParcelResponse) ashsVar).p(), true);
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        q(fastJsonResponse$Field);
        arxc.o(this.b, fastJsonResponse$Field.g, i);
    }

    @Override // defpackage.ashs
    protected final void gy(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        q(fastJsonResponse$Field);
        arwm.s(arrayList);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        arxc.w(this.b, fastJsonResponse$Field.g, strArr, true);
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        q(fastJsonResponse$Field);
        arxc.q(this.b, fastJsonResponse$Field.g, j);
    }

    public final Parcel p() {
        int i = this.f;
        if (i == 0) {
            Parcel parcel = this.b;
            int a = arxc.a(parcel);
            this.g = a;
            arxc.c(parcel, a);
            this.f = 2;
        } else if (i == 1) {
            arxc.c(this.b, this.g);
            this.f = 2;
        }
        return this.b;
    }

    @Override // defpackage.ashs
    public final String toString() {
        FieldMappingDictionary fieldMappingDictionary = this.d;
        arwm.t(fieldMappingDictionary, "Cannot convert to JSON on client side.");
        Parcel p = p();
        p.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        String str = this.e;
        arwm.s(str);
        Map a = fieldMappingDictionary.a(str);
        arwm.s(a);
        r(sb, a, p);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.s(parcel, 2, p(), false);
        int i3 = this.c;
        arxc.t(parcel, 3, i3 != 0 ? i3 != 1 ? this.d : this.d : null, i, false);
        arxc.c(parcel, a);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, defpackage.ashs
    public final Object z(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public SafeParcelResponse(FieldMappingDictionary fieldMappingDictionary, String str) {
        this.a = 1;
        this.b = Parcel.obtain();
        this.c = 0;
        arwm.s(fieldMappingDictionary);
        this.d = fieldMappingDictionary;
        arwm.s(str);
        this.e = str;
        this.f = 0;
    }
}

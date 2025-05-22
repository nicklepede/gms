package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import defpackage.a;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cyiy;
import defpackage.cyiz;
import defpackage.cykj;
import defpackage.elqm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyiz();
    public static final byte[][] a;
    public static final ExperimentTokens b;
    public final String c;
    public final byte[] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;
    public final int[] k;
    public final byte[][] l;

    static {
        byte[][] bArr = new byte[0][];
        a = bArr;
        b = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null, null, bArr);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = bArr5;
        this.i = iArr;
        this.j = bArr6;
        this.k = iArr2;
        this.l = bArr7;
    }

    public static ExperimentTokens c(ByteArrayInputStream byteArrayInputStream) {
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            int readInt = dataInputStream.readInt();
            if (readInt != 1 && readInt != 2 && readInt != 3) {
                throw new RuntimeException(a.j(readInt, "Unexpected version "));
            }
            String readUTF = dataInputStream.readUTF();
            byte[] r = r(dataInputStream);
            byte[][] z = z(dataInputStream);
            byte[][] z2 = z(dataInputStream);
            byte[][] z3 = z(dataInputStream);
            byte[][] z4 = z(dataInputStream);
            int[] t = t(dataInputStream);
            int readInt2 = dataInputStream.readInt();
            return new ExperimentTokens(readUTF, r, z, z2, z3, z4, t, readInt2 == 0 ? null : y(dataInputStream, readInt2), readInt >= 2 ? t(dataInputStream) : null, readInt >= 3 ? z(dataInputStream) : null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ExperimentTokens d(String str) {
        return c(new ByteArrayInputStream(Base64.decode(str, 0)));
    }

    public static ExperimentTokens e(List list) {
        int[] iArr;
        int[] iArr2;
        byte[][] bArr;
        byte[][] bArr2;
        byte[] bArr3;
        int[] iArr3;
        int[] iArr4;
        byte[][] bArr4;
        byte[][] bArr5;
        byte[][] bArr6;
        int[] iArr5;
        byte[][] bArr7;
        int[] iArr6;
        if (list.size() == 1) {
            return (ExperimentTokens) list.get(0);
        }
        String str = (!g(list) || list.isEmpty()) ? "" : ((ExperimentTokens) list.get(0)).c;
        byte[][] u = u(list, new cyiy() { // from class: cyiu
            @Override // defpackage.cyiy
            public final byte[][] a(ExperimentTokens experimentTokens) {
                return experimentTokens.e;
            }
        });
        byte[][] u2 = u(list, new cyiy() { // from class: cyiv
            @Override // defpackage.cyiy
            public final byte[][] a(ExperimentTokens experimentTokens) {
                return experimentTokens.f;
            }
        });
        byte[][] u3 = u(list, new cyiy() { // from class: cyiw
            @Override // defpackage.cyiy
            public final byte[][] a(ExperimentTokens experimentTokens) {
                return experimentTokens.g;
            }
        });
        byte[][] u4 = u(list, new cyiy() { // from class: cyix
            @Override // defpackage.cyiy
            public final byte[][] a(ExperimentTokens experimentTokens) {
                return experimentTokens.h;
            }
        });
        Iterator it = list.iterator();
        int i = 0;
        boolean z = true;
        while (it.hasNext()) {
            ExperimentTokens experimentTokens = (ExperimentTokens) it.next();
            if (experimentTokens != null && (iArr6 = experimentTokens.i) != null) {
                i += iArr6.length;
                z = false;
            }
        }
        if (z) {
            iArr = null;
        } else {
            int[] iArr7 = new int[i];
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                ExperimentTokens experimentTokens2 = (ExperimentTokens) it2.next();
                if (experimentTokens2 != null && (iArr2 = experimentTokens2.i) != null) {
                    int i3 = 0;
                    while (i3 < iArr2.length) {
                        iArr7[i2] = iArr2[i3];
                        i3++;
                        i2++;
                    }
                }
            }
            iArr = iArr7;
        }
        Iterator it3 = list.iterator();
        int i4 = 0;
        boolean z2 = true;
        while (it3.hasNext()) {
            ExperimentTokens experimentTokens3 = (ExperimentTokens) it3.next();
            if (experimentTokens3 != null && experimentTokens3.d != null) {
                i4++;
                z2 = false;
            }
            if (experimentTokens3 != null && (bArr7 = experimentTokens3.j) != null) {
                i4 += bArr7.length;
                z2 = false;
            }
        }
        if (z2) {
            bArr = null;
        } else {
            byte[][] bArr8 = new byte[i4][];
            Iterator it4 = list.iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                ExperimentTokens experimentTokens4 = (ExperimentTokens) it4.next();
                if (experimentTokens4 != null && (bArr3 = experimentTokens4.d) != null) {
                    bArr8[i5] = bArr3;
                    i5++;
                }
                if (experimentTokens4 != null && (bArr2 = experimentTokens4.j) != null) {
                    int i6 = 0;
                    while (i6 < bArr2.length) {
                        bArr8[i5] = bArr2[i6];
                        i6++;
                        i5++;
                    }
                }
            }
            bArr = bArr8;
        }
        Iterator it5 = list.iterator();
        int i7 = 0;
        boolean z3 = true;
        while (it5.hasNext()) {
            ExperimentTokens experimentTokens5 = (ExperimentTokens) it5.next();
            if (experimentTokens5 != null && (iArr5 = experimentTokens5.k) != null) {
                i7 += iArr5.length;
                z3 = false;
            }
        }
        if (z3) {
            iArr3 = null;
        } else {
            int[] iArr8 = new int[i7];
            Iterator it6 = list.iterator();
            int i8 = 0;
            while (it6.hasNext()) {
                ExperimentTokens experimentTokens6 = (ExperimentTokens) it6.next();
                if (experimentTokens6 != null && (iArr4 = experimentTokens6.k) != null) {
                    int i9 = 0;
                    while (i9 < iArr4.length) {
                        iArr8[i8] = iArr4[i9];
                        i9++;
                        i8++;
                    }
                }
            }
            iArr3 = iArr8;
        }
        Iterator it7 = list.iterator();
        int i10 = 0;
        boolean z4 = true;
        while (it7.hasNext()) {
            ExperimentTokens experimentTokens7 = (ExperimentTokens) it7.next();
            if (experimentTokens7 != null && (bArr6 = experimentTokens7.l) != null) {
                i10 += bArr6.length;
                z4 = false;
            }
        }
        if (z4) {
            bArr4 = null;
        } else {
            byte[][] bArr9 = new byte[i10][];
            Iterator it8 = list.iterator();
            int i11 = 0;
            while (it8.hasNext()) {
                ExperimentTokens experimentTokens8 = (ExperimentTokens) it8.next();
                if (experimentTokens8 != null && (bArr5 = experimentTokens8.l) != null) {
                    for (byte[] bArr10 : bArr5) {
                        if (bArr10 != null) {
                            bArr9[i11] = bArr10;
                            i11++;
                        }
                    }
                }
            }
            bArr4 = bArr9;
        }
        return new ExperimentTokens(str, null, u, u2, u3, u4, iArr, bArr, iArr3, bArr4);
    }

    public static boolean g(List list) {
        if (list.isEmpty()) {
            return true;
        }
        String str = ((ExperimentTokens) list.get(0)).c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!cykj.a(str, ((ExperimentTokens) it.next()).c)) {
                return false;
            }
        }
        return true;
    }

    private static int i(byte[][] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                i += bArr2.length;
            }
        }
        return i;
    }

    private static List j(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set k() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.j;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return m((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set l(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet j = elqm.j(length);
        for (int i : iArr) {
            j.add(Integer.valueOf(i));
        }
        return j;
    }

    private static Set m(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet j = elqm.j(length);
        for (byte[] bArr2 : bArr) {
            atzb.s(bArr2);
            j.add(Base64.encodeToString(bArr2, 3));
        }
        return j;
    }

    private static void n(byte[][] bArr, DataOutputStream dataOutputStream) {
        if (bArr == null) {
            dataOutputStream.writeInt(0);
            return;
        }
        dataOutputStream.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            o(bArr2, dataOutputStream);
        }
    }

    private static void o(byte[] bArr, DataOutputStream dataOutputStream) {
        if (bArr == null) {
            dataOutputStream.writeInt(0);
            return;
        }
        int length = bArr.length;
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bArr, 0, length);
    }

    private static void p(int[] iArr, DataOutputStream dataOutputStream) {
        if (iArr == null) {
            dataOutputStream.writeInt(0);
            return;
        }
        dataOutputStream.writeInt(iArr.length);
        for (int i : iArr) {
            dataOutputStream.writeInt(i);
        }
    }

    private static void q(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            atzb.s(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    private static byte[] r(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    private static int[] s(int[] iArr) {
        int length;
        return (iArr == null || (length = iArr.length) == 0) ? iArr : Arrays.copyOf(iArr, length);
    }

    private static int[] t(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt == 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i = 0; i < readInt; i++) {
            iArr[i] = dataInputStream.readInt();
        }
        return iArr;
    }

    private static byte[][] u(List list, cyiy cyiyVar) {
        byte[][] a2;
        byte[][] a3;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ExperimentTokens experimentTokens = (ExperimentTokens) it.next();
            if (experimentTokens != null && (a3 = cyiyVar.a(experimentTokens)) != null) {
                i += a3.length;
            }
        }
        byte[][] bArr = new byte[i][];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) it2.next();
            if (experimentTokens2 != null && (a2 = cyiyVar.a(experimentTokens2)) != null) {
                for (byte[] bArr2 : a2) {
                    if (bArr2 != null) {
                        bArr[i2] = bArr2;
                        i2++;
                    }
                }
            }
        }
        return bArr;
    }

    private static byte[][] v(byte[][] bArr, int i) {
        int length;
        byte[][] bArr2 = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr3 = bArr[i2];
            if (bArr3 == null || (length = bArr3.length) == 0) {
                bArr2[i2] = bArr3;
            } else {
                bArr2[i2] = Arrays.copyOf(bArr3, length);
            }
        }
        return bArr2;
    }

    private static byte[][] w(byte[][] bArr) {
        return v(bArr, bArr.length);
    }

    private static byte[][] x(byte[][] bArr) {
        int length;
        return (bArr == null || (length = bArr.length) == 0) ? bArr : v(bArr, length);
    }

    private static byte[][] y(DataInputStream dataInputStream, int i) {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = r(dataInputStream);
        }
        return bArr;
    }

    private static byte[][] z(DataInputStream dataInputStream) {
        return y(dataInputStream, dataInputStream.readInt());
    }

    public final int a() {
        int length = this.c.length();
        int i = length + length;
        byte[] bArr = this.d;
        int length2 = i + (bArr == null ? 0 : bArr.length) + i(this.e) + i(this.f) + i(this.g) + i(this.h) + i(this.j);
        int[] iArr = this.i;
        int length3 = length2 + ((iArr == null ? 0 : iArr.length) * 4);
        int[] iArr2 = this.k;
        return length3 + ((iArr2 != null ? iArr2.length : 0) * 4) + i(this.l);
    }

    public final ExperimentTokens b() {
        int length;
        byte[] bArr = this.d;
        if (bArr != null && (length = bArr.length) != 0) {
            bArr = Arrays.copyOf(bArr, length);
        }
        return new ExperimentTokens(this.c, bArr, w(this.e), w(this.f), w(this.g), w(this.h), s(this.i), x(this.j), s(this.k), x(this.l));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (cykj.a(this.c, experimentTokens.c) && cykj.a(k(), experimentTokens.k()) && cykj.a(m(this.e), m(experimentTokens.e)) && cykj.a(m(this.f), m(experimentTokens.f)) && cykj.a(m(this.g), m(experimentTokens.g)) && cykj.a(m(this.h), m(experimentTokens.h)) && cykj.a(l(this.i), l(experimentTokens.i)) && cykj.a(j(this.k), j(experimentTokens.k)) && cykj.a(m(this.l), m(experimentTokens.l))) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return Base64.encodeToString(h(), 0);
    }

    public final byte[] h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            try {
                try {
                    dataOutputStream.writeInt(3);
                    dataOutputStream.writeUTF(this.c);
                    o(this.d, dataOutputStream);
                    n(this.e, dataOutputStream);
                    n(this.f, dataOutputStream);
                    n(this.g, dataOutputStream);
                    n(this.h, dataOutputStream);
                    p(this.i, dataOutputStream);
                    n(this.j, dataOutputStream);
                    p(this.k, dataOutputStream);
                    n(this.l, dataOutputStream);
                    dataOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } finally {
            dataOutputStream.close();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.c;
        sb.append(str == null ? "null" : a.a(str, "'", "'"));
        byte[] bArr = this.d;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        q(sb, "GAIA=", this.e);
        sb.append(", ");
        q(sb, "PSEUDO=", this.f);
        sb.append(", ");
        q(sb, "ALWAYS=", this.g);
        sb.append(", ");
        q(sb, "OTHER=", this.h);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.i));
        sb.append(", ");
        q(sb, "directs=", this.j);
        sb.append(", genDims=");
        sb.append(Arrays.toString(j(this.k).toArray()));
        sb.append(", ");
        q(sb, "external=", this.l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.i(parcel, 3, this.d, false);
        atzr.A(parcel, 4, this.e);
        atzr.A(parcel, 5, this.f);
        atzr.A(parcel, 6, this.g);
        atzr.A(parcel, 7, this.h);
        atzr.p(parcel, 8, this.i, false);
        atzr.A(parcel, 9, this.j);
        atzr.p(parcel, 10, this.k, false);
        atzr.A(parcel, 11, this.l);
        atzr.c(parcel, a2);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr) {
        this(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, null, null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, byte[][] bArr7) {
        this(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, null, bArr7);
    }
}

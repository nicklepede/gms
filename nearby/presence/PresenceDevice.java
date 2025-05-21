package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cfey;
import defpackage.cffc;
import defpackage.cffe;
import defpackage.cizq;
import defpackage.ckjz;
import defpackage.ckka;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PresenceDevice extends AbstractSafeParcelable implements cffe {
    public static final Parcelable.Creator CREATOR = new ckka();
    private static final String[] p = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};
    public final long a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final byte[] g;
    public final PresenceIdentity h;
    public final byte[] i;
    public final DataElementCollection j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final String o;
    private final byte[] q;
    private final List r;

    public PresenceDevice(long j, String str, int i, String str2, long j2, String str3, byte[] bArr, byte[] bArr2, List list, PresenceIdentity presenceIdentity, byte[] bArr3, DataElementCollection dataElementCollection, int i2, int i3, String str4, String str5, String str6) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.q = bArr;
        this.g = bArr2;
        this.r = list;
        this.h = presenceIdentity;
        this.i = bArr3;
        this.j = dataElementCollection;
        this.k = i2;
        this.l = i3;
        this.m = str4;
        this.n = str5;
        this.o = str6;
    }

    public static String h(int i) {
        char c;
        String[] strArr = p;
        switch (i) {
            case 1:
                c = 1;
                break;
            case 2:
                c = 2;
                break;
            case 3:
                c = 3;
                break;
            case 4:
                c = 4;
                break;
            case 5:
                c = 5;
                break;
            case 6:
                c = 6;
                break;
            case 7:
                c = 7;
                break;
            case 8:
                c = '\b';
                break;
            case 9:
                c = '\t';
                break;
            case 10:
                c = '\n';
                break;
            default:
                c = 0;
                break;
        }
        return strArr[c];
    }

    @Override // defpackage.cffe
    public final int a() {
        return 2;
    }

    @Override // defpackage.cffe
    public final int b() {
        return this.l;
    }

    @Override // defpackage.cffe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ckjz d() {
        ckjz ckjzVar = new ckjz();
        ckjzVar.b = this.b;
        ckjzVar.c = this.c;
        ckjzVar.a = this.a;
        ckjzVar.d = this.d;
        ckjzVar.j = this.l;
        ckjzVar.e(this.f);
        ckjzVar.k = this.m;
        ckjzVar.f(this.o);
        ckjzVar.g(this.n);
        byte[] bArr = this.g;
        if (bArr != null) {
            ckjzVar.f = bArr;
        }
        byte[] bArr2 = this.q;
        if (bArr2 != null) {
            ckjzVar.e = bArr2;
        }
        List list = this.r;
        if (list != null) {
            ckjzVar.d(list);
        }
        ckjzVar.i = this.h;
        byte[] bArr3 = this.i;
        if (bArr3 != null) {
            Iterator it = cizq.f(bArr3).iterator();
            while (it.hasNext()) {
                ckjzVar.c((cfey) it.next());
            }
        }
        DataElementCollection dataElementCollection = this.j;
        if (dataElementCollection != null) {
            ckjzVar.g = dataElementCollection;
        }
        ckjzVar.h = this.k;
        return ckjzVar;
    }

    @Override // defpackage.cffe
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PresenceDevice) {
            PresenceDevice presenceDevice = (PresenceDevice) obj;
            if (arwb.b(Long.valueOf(this.a), Long.valueOf(presenceDevice.a)) && arwb.b(this.b, presenceDevice.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(presenceDevice.c)) && arwb.b(this.d, presenceDevice.d) && arwb.b(this.f, presenceDevice.f) && Arrays.equals(this.q, presenceDevice.q) && Arrays.equals(this.g, presenceDevice.g) && arwb.b(this.r, presenceDevice.r) && arwb.b(this.h, presenceDevice.h) && Arrays.equals(this.i, presenceDevice.i) && arwb.b(this.j, presenceDevice.j) && arwb.b(Integer.valueOf(this.k), Integer.valueOf(presenceDevice.k)) && arwb.b(Integer.valueOf(this.l), Integer.valueOf(presenceDevice.l)) && arwb.b(this.m, presenceDevice.m) && arwb.b(this.n, presenceDevice.n) && arwb.b(this.o, presenceDevice.o)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cffe
    public final List f() {
        return cizq.f(this.i);
    }

    @Override // defpackage.cffe
    public final byte[] g() {
        byte[] bArr = this.q;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.f, Integer.valueOf(Arrays.hashCode(this.q)), Integer.valueOf(Arrays.hashCode(this.g)), this.r, this.h, Integer.valueOf(Arrays.hashCode(this.i)), this.j, Integer.valueOf(this.k), Integer.valueOf(this.l), this.m, this.n, this.o});
    }

    public final List i() {
        List list = this.r;
        if (list != null) {
            return eitj.i(list);
        }
        int i = eitj.d;
        return ejcb.a;
    }

    public final String toString() {
        Long valueOf = Long.valueOf(this.a);
        String str = this.b;
        String h = h(this.c);
        String str2 = this.d;
        Long valueOf2 = Long.valueOf(this.e);
        String str3 = this.f;
        byte[] bArr = this.q;
        String arrays = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.g;
        Integer valueOf3 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        List list = this.r;
        PresenceIdentity presenceIdentity = this.h;
        byte[] bArr3 = this.i;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s, Dusi: %s, modelName: %s, manufacturer: %s>", valueOf, str, h, str2, valueOf2, str3, arrays, valueOf3, list, presenceIdentity, bArr3 != null ? Arrays.toString(bArr3) : null, this.j, Integer.valueOf(this.k), cffc.a(this.l), this.m, this.n, this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ckka.a(this, parcel, i);
    }
}

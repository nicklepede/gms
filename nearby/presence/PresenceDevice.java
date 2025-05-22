package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.chmk;
import defpackage.chmo;
import defpackage.chmq;
import defpackage.clhv;
import defpackage.cmse;
import defpackage.cmsf;
import defpackage.elgo;
import defpackage.elpg;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceDevice extends AbstractSafeParcelable implements chmq {
    public static final Parcelable.Creator CREATOR = new cmsf();
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

    @Override // defpackage.chmq
    public final int a() {
        return 2;
    }

    @Override // defpackage.chmq
    public final int b() {
        return this.l;
    }

    @Override // defpackage.chmq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cmse d() {
        cmse cmseVar = new cmse();
        cmseVar.b = this.b;
        cmseVar.c = this.c;
        cmseVar.a = this.a;
        cmseVar.d = this.d;
        cmseVar.j = this.l;
        cmseVar.e(this.f);
        cmseVar.k = this.m;
        cmseVar.f(this.o);
        cmseVar.g(this.n);
        byte[] bArr = this.g;
        if (bArr != null) {
            cmseVar.f = bArr;
        }
        byte[] bArr2 = this.q;
        if (bArr2 != null) {
            cmseVar.e = bArr2;
        }
        List list = this.r;
        if (list != null) {
            cmseVar.d(list);
        }
        cmseVar.i = this.h;
        byte[] bArr3 = this.i;
        if (bArr3 != null) {
            Iterator it = clhv.f(bArr3).iterator();
            while (it.hasNext()) {
                cmseVar.c((chmk) it.next());
            }
        }
        DataElementCollection dataElementCollection = this.j;
        if (dataElementCollection != null) {
            cmseVar.g = dataElementCollection;
        }
        cmseVar.h = this.k;
        return cmseVar;
    }

    @Override // defpackage.chmq
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PresenceDevice) {
            PresenceDevice presenceDevice = (PresenceDevice) obj;
            if (atyq.b(Long.valueOf(this.a), Long.valueOf(presenceDevice.a)) && atyq.b(this.b, presenceDevice.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(presenceDevice.c)) && atyq.b(this.d, presenceDevice.d) && atyq.b(this.f, presenceDevice.f) && Arrays.equals(this.q, presenceDevice.q) && Arrays.equals(this.g, presenceDevice.g) && atyq.b(this.r, presenceDevice.r) && atyq.b(this.h, presenceDevice.h) && Arrays.equals(this.i, presenceDevice.i) && atyq.b(this.j, presenceDevice.j) && atyq.b(Integer.valueOf(this.k), Integer.valueOf(presenceDevice.k)) && atyq.b(Integer.valueOf(this.l), Integer.valueOf(presenceDevice.l)) && atyq.b(this.m, presenceDevice.m) && atyq.b(this.n, presenceDevice.n) && atyq.b(this.o, presenceDevice.o)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chmq
    public final List f() {
        return clhv.f(this.i);
    }

    @Override // defpackage.chmq
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
            return elgo.i(list);
        }
        int i = elgo.d;
        return elpg.a;
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
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s, Dusi: %s, modelName: %s, manufacturer: %s>", valueOf, str, h, str2, valueOf2, str3, arrays, valueOf3, list, presenceIdentity, bArr3 != null ? Arrays.toString(bArr3) : null, this.j, Integer.valueOf(this.k), chmo.a(this.l), this.m, this.n, this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cmsf.a(this, parcel, i);
    }
}

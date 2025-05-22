package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.chmd;
import defpackage.chme;
import defpackage.chmk;
import defpackage.chmo;
import defpackage.chmq;
import defpackage.clhv;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ConnectionsDevice extends AbstractSafeParcelable implements chmq {
    public static final Parcelable.Creator CREATOR = new chme();
    public final String a;
    public final byte[] b;
    public final byte[] c;
    public final int d;
    private final byte[] e;

    public ConnectionsDevice(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.a = str;
        this.e = bArr;
        this.b = bArr2;
        this.c = bArr3;
        this.d = i;
    }

    @Override // defpackage.chmq
    public final int a() {
        return 1;
    }

    @Override // defpackage.chmq
    public final int b() {
        return this.d;
    }

    @Override // defpackage.chmq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final chmd d() {
        chmd chmdVar = new chmd();
        chmdVar.e(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            chmdVar.b = bArr;
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            chmdVar.a = bArr2;
        }
        byte[] bArr3 = this.c;
        if (bArr3 != null) {
            Iterator it = clhv.f(bArr3).iterator();
            while (it.hasNext()) {
                chmdVar.c((chmk) it.next());
            }
        }
        chmdVar.c = this.d;
        return chmdVar;
    }

    @Override // defpackage.chmq
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionsDevice) {
            ConnectionsDevice connectionsDevice = (ConnectionsDevice) obj;
            if (atyq.b(this.a, connectionsDevice.a) && Arrays.equals(this.e, connectionsDevice.e) && Arrays.equals(this.b, connectionsDevice.b) && Arrays.equals(this.c, connectionsDevice.c) && this.d == connectionsDevice.d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.chmq
    public final List f() {
        return clhv.f(this.c);
    }

    @Override // defpackage.chmq
    public final byte[] g() {
        byte[] bArr = this.e;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str = this.a;
        byte[] bArr = this.e;
        String arrays = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.c;
        return String.format("ConnectionsDevice:<endpointId: %s, endpointInfo: %s, connectivityBytes: %s, instanceType : %s>", str, arrays, bArr2 != null ? Arrays.toString(bArr2) : null, chmo.a(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        chme.a(this, parcel);
    }
}

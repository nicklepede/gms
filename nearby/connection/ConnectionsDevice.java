package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cfer;
import defpackage.cfes;
import defpackage.cfey;
import defpackage.cffc;
import defpackage.cffe;
import defpackage.cizq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ConnectionsDevice extends AbstractSafeParcelable implements cffe {
    public static final Parcelable.Creator CREATOR = new cfes();
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

    @Override // defpackage.cffe
    public final int a() {
        return 1;
    }

    @Override // defpackage.cffe
    public final int b() {
        return this.d;
    }

    @Override // defpackage.cffe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cfer d() {
        cfer cferVar = new cfer();
        cferVar.e(this.a);
        byte[] bArr = this.b;
        if (bArr != null) {
            cferVar.b = bArr;
        }
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            cferVar.a = bArr2;
        }
        byte[] bArr3 = this.c;
        if (bArr3 != null) {
            Iterator it = cizq.f(bArr3).iterator();
            while (it.hasNext()) {
                cferVar.c((cfey) it.next());
            }
        }
        cferVar.c = this.d;
        return cferVar;
    }

    @Override // defpackage.cffe
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionsDevice) {
            ConnectionsDevice connectionsDevice = (ConnectionsDevice) obj;
            if (arwb.b(this.a, connectionsDevice.a) && Arrays.equals(this.e, connectionsDevice.e) && Arrays.equals(this.b, connectionsDevice.b) && Arrays.equals(this.c, connectionsDevice.c) && this.d == connectionsDevice.d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cffe
    public final List f() {
        return cizq.f(this.c);
    }

    @Override // defpackage.cffe
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
        return String.format("ConnectionsDevice:<endpointId: %s, endpointInfo: %s, connectivityBytes: %s, instanceType : %s>", str, arrays, bArr2 != null ? Arrays.toString(bArr2) : null, cffc.a(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cfes.a(this, parcel);
    }
}

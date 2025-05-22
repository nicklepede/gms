package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aeea;
import defpackage.atzr;
import defpackage.bsl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeea();
    public final int a;
    public final RemoteDevice b;
    public final Role[] c;
    public final int d;
    public final byte[] e;

    public ConnectionInfo(int i, RemoteDevice remoteDevice, Role[] roleArr, int i2, byte[] bArr) {
        this.a = i;
        this.b = remoteDevice;
        this.c = roleArr;
        this.d = i2;
        this.e = bArr;
    }

    public static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "[unknown]" : "[connecting]" : "[authenticated]" : "[authenticating]" : "[connected]" : "[disconnected]";
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                ConnectionInfo connectionInfo = (ConnectionInfo) obj;
                boolean equals = new bsl(Arrays.asList(this.c)).equals(new bsl(Arrays.asList(connectionInfo.c)));
                if (connectionInfo.b.equals(this.b) && equals && connectionInfo.d == this.d && Arrays.equals(connectionInfo.e, this.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Role[] roleArr = this.c;
        Role[] roleArr2 = (Role[]) Arrays.copyOf(roleArr, roleArr.length);
        Arrays.sort(roleArr2);
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b.hashCode()), Integer.valueOf(Arrays.hashCode(roleArr2)), Integer.valueOf(this.d), this.e});
    }

    public final String toString() {
        String remoteDevice = this.b.toString();
        String arrays = Arrays.toString(this.c);
        String a = a(this.d);
        byte[] bArr = this.e;
        return String.format("(%s, %s, %s, len(cbd)=%s)", remoteDevice, arrays, a, bArr == null ? "<null>" : Integer.valueOf(bArr.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RemoteDevice remoteDevice = this.b;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, remoteDevice, i, false);
        atzr.J(parcel, 2, this.c, i);
        atzr.o(parcel, 3, this.d);
        atzr.i(parcel, 4, this.e, false);
        atzr.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        atzr.c(parcel, a);
    }
}

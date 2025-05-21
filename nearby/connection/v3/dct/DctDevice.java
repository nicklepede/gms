package com.google.android.gms.nearby.connection.v3.dct;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.cffd;
import defpackage.cffe;
import defpackage.cgck;
import defpackage.cgcl;
import defpackage.eitj;
import defpackage.ejcb;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DctDevice extends AbstractSafeParcelable implements cffe {
    public static final Parcelable.Creator CREATOR = new cgcl();
    public final String a;
    public final List b;

    public DctDevice(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.cffe
    public final int a() {
        return 3;
    }

    @Override // defpackage.cffe
    public final int b() {
        return 0;
    }

    @Override // defpackage.cffe
    public final /* bridge */ /* synthetic */ cffd d() {
        cgck cgckVar = new cgck();
        cgckVar.a = this.a;
        cgckVar.b = this.b;
        return cgckVar;
    }

    @Override // defpackage.cffe
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DctDevice) {
            DctDevice dctDevice = (DctDevice) obj;
            if (arwb.b(this.a, dctDevice.a) && arwb.b(this.b, dctDevice.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cffe
    public final List f() {
        int i = eitj.d;
        return ejcb.a;
    }

    @Override // defpackage.cffe
    public final byte[] g() {
        for (DctDeviceDataElement dctDeviceDataElement : this.b) {
            if (dctDeviceDataElement.a == 7) {
                return dctDeviceDataElement.c;
            }
        }
        return new byte[0];
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return String.format("DctDevice:<endpointId: %s, deviceDataElements: %s>", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cgcl.a(this, parcel);
    }
}

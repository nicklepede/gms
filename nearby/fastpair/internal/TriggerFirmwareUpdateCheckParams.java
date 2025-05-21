package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifs;
import defpackage.cifu;
import defpackage.cigp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class TriggerFirmwareUpdateCheckParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigp();
    public byte[] a;
    public String b;
    public cifu c;
    public String d;

    public TriggerFirmwareUpdateCheckParams() {
    }

    public final IBinder a() {
        return this.c.asBinder();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TriggerFirmwareUpdateCheckParams) {
            TriggerFirmwareUpdateCheckParams triggerFirmwareUpdateCheckParams = (TriggerFirmwareUpdateCheckParams) obj;
            if (Arrays.equals(this.a, triggerFirmwareUpdateCheckParams.a) && arwb.b(this.b, triggerFirmwareUpdateCheckParams.b) && arwb.b(this.c, triggerFirmwareUpdateCheckParams.c) && arwb.b(this.d, triggerFirmwareUpdateCheckParams.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.D(parcel, 3, a());
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public TriggerFirmwareUpdateCheckParams(byte[] bArr, String str, IBinder iBinder, String str2) {
        cifu cifsVar;
        if (iBinder == null) {
            cifsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cifsVar = queryLocalInterface instanceof cifu ? (cifu) queryLocalInterface : new cifs(iBinder);
        }
        this.a = bArr;
        this.b = str;
        this.c = cifsVar;
        this.d = str2;
    }
}

package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cifv;
import defpackage.cigo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class TriggerFastPairByAccountKeyParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cigo();
    public byte[] a;
    public cifv b;

    private TriggerFastPairByAccountKeyParams() {
    }

    public final IBinder a() {
        return this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TriggerFastPairByAccountKeyParams) {
            TriggerFastPairByAccountKeyParams triggerFastPairByAccountKeyParams = (TriggerFastPairByAccountKeyParams) obj;
            if (Arrays.equals(this.a, triggerFastPairByAccountKeyParams.a) && arwb.b(this.b, triggerFastPairByAccountKeyParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.D(parcel, 2, a());
        arxc.c(parcel, a);
    }

    public TriggerFastPairByAccountKeyParams(byte[] bArr, IBinder iBinder) {
        cifv cifvVar;
        if (iBinder == null) {
            cifvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairTriggerFastPairByAccountKeyCallback");
            cifvVar = queryLocalInterface instanceof cifv ? (cifv) queryLocalInterface : new cifv(iBinder);
        }
        this.a = bArr;
        this.b = cifvVar;
    }
}

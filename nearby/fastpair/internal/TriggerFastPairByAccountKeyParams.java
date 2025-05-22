package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckoa;
import defpackage.ckot;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class TriggerFastPairByAccountKeyParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckot();
    public byte[] a;
    public ckoa b;

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
            if (Arrays.equals(this.a, triggerFastPairByAccountKeyParams.a) && atyq.b(this.b, triggerFastPairByAccountKeyParams.b)) {
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
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.D(parcel, 2, a());
        atzr.c(parcel, a);
    }

    public TriggerFastPairByAccountKeyParams(byte[] bArr, IBinder iBinder) {
        ckoa ckoaVar;
        if (iBinder == null) {
            ckoaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairTriggerFastPairByAccountKeyCallback");
            ckoaVar = queryLocalInterface instanceof ckoa ? (ckoa) queryLocalInterface : new ckoa(iBinder);
        }
        this.a = bArr;
        this.b = ckoaVar;
    }
}

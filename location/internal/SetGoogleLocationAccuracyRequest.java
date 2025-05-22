package com.google.android.gms.location.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cclg;
import defpackage.evmg;
import defpackage.evmr;
import defpackage.evoi;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SetGoogleLocationAccuracyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cclg();
    public final boolean a;
    public final evmg b;
    public final evoi c;
    public final evmr d;

    public SetGoogleLocationAccuracyRequest(boolean z, int i, byte[] bArr, byte[] bArr2) {
        evoi evoiVar;
        this.a = z;
        evmg b = evmg.b(i);
        atzb.s(b);
        this.b = b;
        evmr evmrVar = null;
        if (bArr != null) {
            try {
                fgri y = fgri.y(evoi.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                evoiVar = (evoi) y;
            } catch (fgsd e) {
                throw new BadParcelableException(e);
            }
        } else {
            evoiVar = null;
        }
        this.c = evoiVar;
        if (bArr2 != null) {
            fgri y2 = fgri.y(evmr.a, bArr2, 0, bArr2.length, fgqp.a());
            fgri.M(y2);
            evmrVar = (evmr) y2;
        }
        this.d = evmrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.o(parcel, 2, this.b.m);
        evoi evoiVar = this.c;
        atzr.i(parcel, 3, evoiVar == null ? null : evoiVar.r(), false);
        evmr evmrVar = this.d;
        atzr.i(parcel, 4, evmrVar != null ? evmrVar.r() : null, false);
        atzr.c(parcel, a);
    }
}

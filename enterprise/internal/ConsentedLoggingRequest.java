package com.google.android.gms.enterprise.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbqm;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fyyi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ConsentedLoggingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbqm();
    private final fyyi a;

    public ConsentedLoggingRequest(fyyi fyyiVar) {
        this.a = fyyiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fyyi fyyiVar = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, fyyiVar.r(), false);
        atzr.c(parcel, a);
    }

    public ConsentedLoggingRequest(byte[] bArr) {
        try {
            fgri y = fgri.y(fyyi.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y);
            this.a = (fyyi) y;
        } catch (fgsd e) {
            throw new IllegalArgumentException("Failed to parse event from bytes", e);
        }
    }
}

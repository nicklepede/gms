package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmmh;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CreateCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bmmh();
    public final PendingIntent a;
    public final CreateCredentialResponse b;

    public CreateCredentialHandle(PendingIntent pendingIntent, CreateCredentialResponse createCredentialResponse) {
        this.a = pendingIntent;
        this.b = createCredentialResponse;
        if (pendingIntent == null && createCredentialResponse == null) {
            throw new IllegalArgumentException("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        PendingIntent pendingIntent = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, pendingIntent, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}

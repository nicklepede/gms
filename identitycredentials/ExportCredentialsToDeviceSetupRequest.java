package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bmmn;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ExportCredentialsToDeviceSetupRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bmmn();
    public final Uri a;

    public ExportCredentialsToDeviceSetupRequest(Uri uri) {
        fvbo.f(uri, "uri");
        this.a = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        Uri uri = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, uri, i, false);
        arxc.c(parcel, a);
    }
}

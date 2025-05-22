package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.botg;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ExportCredentialsToDeviceSetupRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new botg();
    public final Uri a;
    public final Bundle b;

    public ExportCredentialsToDeviceSetupRequest(Uri uri, Bundle bundle) {
        fxxm.f(uri, "uri");
        fxxm.f(bundle, "requestData");
        this.a = uri;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        Uri uri = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, uri, i, false);
        atzr.g(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}

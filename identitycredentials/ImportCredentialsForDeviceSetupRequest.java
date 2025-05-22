package com.google.android.gms.identitycredentials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.boto;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImportCredentialsForDeviceSetupRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new boto();
    public final String a;
    public final Uri b;
    public final Bundle c;

    public ImportCredentialsForDeviceSetupRequest(String str, Uri uri, Bundle bundle) {
        fxxm.f(str, "requestJson");
        fxxm.f(uri, "uri");
        fxxm.f(bundle, "requestData");
        this.a = str;
        this.b = uri;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bcqg;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class BrowserSignRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator CREATOR = new bcqg();
    public final SignRequestParams a;
    public final Uri b;

    public BrowserSignRequestParams(SignRequestParams signRequestParams, Uri uri) {
        arwm.s(signRequestParams);
        this.a = signRequestParams;
        arwm.s(uri);
        arwm.c(uri.getScheme() != null, "origin scheme must be non-empty");
        arwm.c(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.BrowserRequestParams
    public final Uri a() {
        return this.b;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final ChannelIdValue b() {
        return this.a.f;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Double c() {
        return this.a.b;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Integer d() {
        return this.a.a;
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public final Set e() {
        return this.a.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserSignRequestParams)) {
            return false;
        }
        BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) obj;
        return arwb.b(this.a, browserSignRequestParams.a) && arwb.b(this.b, browserSignRequestParams.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignRequestParams signRequestParams = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, signRequestParams, i, false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.c(parcel, a);
    }
}

package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxc;
import defpackage.bbwb;
import defpackage.bbwe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class RequestValidationViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new bbwb();

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions
    public final bbwe b() {
        return bbwe.REQUEST_VALIDATION;
    }

    public final boolean equals(Object obj) {
        return obj instanceof RequestValidationViewOptions;
    }

    @Override // com.google.android.gms.fido.fido2.api.view.ViewOptions, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        arxc.c(parcel, arxc.a(parcel));
    }
}

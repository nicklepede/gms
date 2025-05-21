package com.google.android.gms.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dctf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecordConsentByConsentResultRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dctf();
    public final Bundle a;

    public RecordConsentByConsentResultRequest(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = arxc.a(parcel);
        arxc.g(parcel, 1, bundle, false);
        arxc.c(parcel, a);
    }
}

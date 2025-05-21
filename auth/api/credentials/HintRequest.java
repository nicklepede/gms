package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.vrd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vrd();
    final int a;
    public final CredentialPickerConfig b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final String g;
    public final String h;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        arwm.s(credentialPickerConfig);
        this.b = credentialPickerConfig;
        this.c = z;
        this.d = z2;
        arwm.s(strArr);
        this.e = strArr;
        if (i < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z3;
            this.g = str;
            this.h = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CredentialPickerConfig credentialPickerConfig = this.b;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, credentialPickerConfig, i, false);
        arxc.e(parcel, 2, this.c);
        arxc.e(parcel, 3, this.d);
        arxc.w(parcel, 4, this.e, false);
        arxc.e(parcel, 5, this.f);
        arxc.v(parcel, 6, this.g, false);
        arxc.v(parcel, 7, this.h, false);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }
}

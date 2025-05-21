package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.vql;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vql();
    final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig d;
    public final CredentialPickerConfig e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i;
        this.b = z;
        arwm.s(strArr);
        this.c = strArr;
        this.d = credentialPickerConfig == null ? new CredentialPickerConfig() : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? new CredentialPickerConfig() : credentialPickerConfig2;
        if (i < 3) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z2;
            this.g = str;
            this.h = str2;
        }
        this.i = z3;
    }

    public final Set a() {
        return new HashSet(Arrays.asList(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.w(parcel, 2, this.c, false);
        arxc.t(parcel, 3, this.d, i, false);
        arxc.t(parcel, 4, this.e, i, false);
        arxc.e(parcel, 5, this.f);
        arxc.v(parcel, 6, this.g, false);
        arxc.v(parcel, 7, this.h, false);
        arxc.e(parcel, 8, this.i);
        arxc.o(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        arxc.c(parcel, a);
    }
}

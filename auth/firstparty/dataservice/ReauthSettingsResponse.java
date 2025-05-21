package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazl;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ReauthSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazl();
    final int a;
    public final int b;
    public final PasswordSettings c;
    public final PinSettings d;

    public ReauthSettingsResponse(int i, int i2, PasswordSettings passwordSettings, PinSettings pinSettings) {
        this.a = i;
        this.b = i2;
        this.c = passwordSettings;
        this.d = pinSettings;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public ReauthSettingsResponse(int i) {
        this(1, i, null, null);
    }
}

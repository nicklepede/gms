package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asqh;
import defpackage.bhbd;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FontFetchResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bhbd();
    private static final Status f = new Status(8, "File missing");
    private static final Status g = new Status(8, "Unable to get FD");
    final int a;
    public final Status b;
    public final String c;
    public final ParcelFileDescriptor d;
    public final FontMatchSpec e;

    public FontFetchResult(int i, Status status, String str, ParcelFileDescriptor parcelFileDescriptor, FontMatchSpec fontMatchSpec) {
        this.a = i;
        arwm.t(status, "status");
        this.b = status;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = fontMatchSpec;
        if (i >= 2) {
            boolean z = status.e() != (fontMatchSpec == null);
            String str2 = true != status.e() ? "" : "not ";
            arwm.m(z, "spec must be " + str2 + "null for " + String.valueOf(status));
        }
    }

    public static FontFetchResult b(Status status) {
        arwm.t(status, "failureStatus");
        arwm.m(!status.e(), "Failure status cannot be successful: ".concat(String.valueOf(String.valueOf(status))));
        return new FontFetchResult(2, status, null, null, null);
    }

    public static FontFetchResult c(FontMatchSpec fontMatchSpec, File file) {
        if (!file.exists()) {
            return b(f);
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            return new FontFetchResult(2, Status.b, !asqh.a() ? file.getAbsolutePath() : null, open, fontMatchSpec);
        } catch (FileNotFoundException unused) {
            return b(g);
        }
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        return String.format("{%s, %s, %s}", this.b, this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.c(parcel, a);
    }
}

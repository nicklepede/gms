package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ddrl;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DirectTransferConfigurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddrl();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public AccountPickerOptions g;
    public String h;
    public String i;
    public AuthenticatingUser j;
    public ArrayList k;
    public int l;
    public UiCustomization m;

    public DirectTransferConfigurations() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DirectTransferConfigurations)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        DirectTransferConfigurations directTransferConfigurations = (DirectTransferConfigurations) obj;
        return arwb.b(this.a, directTransferConfigurations.a) && arwb.b(this.b, directTransferConfigurations.b) && arwb.b(this.c, directTransferConfigurations.c) && arwb.b(this.d, directTransferConfigurations.d) && arwb.b(this.e, directTransferConfigurations.e) && arwb.b(Boolean.valueOf(this.f), Boolean.valueOf(directTransferConfigurations.f)) && arwb.b(this.g, directTransferConfigurations.g) && arwb.b(this.h, directTransferConfigurations.h) && arwb.b(this.i, directTransferConfigurations.i) && arwb.b(this.j, directTransferConfigurations.j) && arwb.b(this.k, directTransferConfigurations.k) && arwb.b(Integer.valueOf(this.l), Integer.valueOf(directTransferConfigurations.l)) && arwb.b(this.m, directTransferConfigurations.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.t(parcel, 10, this.j, i, false);
        arxc.y(parcel, 11, this.k, false);
        arxc.o(parcel, 12, this.l);
        arxc.t(parcel, 13, this.m, i, false);
        arxc.c(parcel, a);
    }

    public DirectTransferConfigurations(String str, String str2, String str3, String str4, String str5, boolean z, AccountPickerOptions accountPickerOptions, String str6, String str7, AuthenticatingUser authenticatingUser, ArrayList arrayList, int i, UiCustomization uiCustomization) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = accountPickerOptions;
        this.h = str6;
        this.i = str7;
        this.j = authenticatingUser;
        this.k = arrayList;
        this.l = i;
        this.m = uiCustomization;
    }
}

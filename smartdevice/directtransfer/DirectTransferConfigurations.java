package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dgcq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DirectTransferConfigurations extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dgcq();
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
        return atyq.b(this.a, directTransferConfigurations.a) && atyq.b(this.b, directTransferConfigurations.b) && atyq.b(this.c, directTransferConfigurations.c) && atyq.b(this.d, directTransferConfigurations.d) && atyq.b(this.e, directTransferConfigurations.e) && atyq.b(Boolean.valueOf(this.f), Boolean.valueOf(directTransferConfigurations.f)) && atyq.b(this.g, directTransferConfigurations.g) && atyq.b(this.h, directTransferConfigurations.h) && atyq.b(this.i, directTransferConfigurations.i) && atyq.b(this.j, directTransferConfigurations.j) && atyq.b(this.k, directTransferConfigurations.k) && atyq.b(Integer.valueOf(this.l), Integer.valueOf(directTransferConfigurations.l)) && atyq.b(this.m, directTransferConfigurations.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.t(parcel, 10, this.j, i, false);
        atzr.y(parcel, 11, this.k, false);
        atzr.o(parcel, 12, this.l);
        atzr.t(parcel, 13, this.m, i, false);
        atzr.c(parcel, a);
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

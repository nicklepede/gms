package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.AccountInterruptControls;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.wkl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ResolutionData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wkl();
    final int a;
    public final String b;
    public final int c;
    public final String d;
    public final BrowserResolutionCookie[] e;
    public final boolean f;
    public final NotificationParams g;
    public final AccountInterruptControls h;

    public ResolutionData(int i, String str, int i2, String str2, BrowserResolutionCookie[] browserResolutionCookieArr, boolean z, NotificationParams notificationParams, AccountInterruptControls accountInterruptControls) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = browserResolutionCookieArr;
        this.f = z;
        this.g = notificationParams;
        this.h = accountInterruptControls;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ResolutionData)) {
            return false;
        }
        ResolutionData resolutionData = (ResolutionData) obj;
        return TextUtils.equals(this.b, resolutionData.b) && this.c == resolutionData.c && TextUtils.equals(this.d, resolutionData.d) && Arrays.equals(this.e, resolutionData.e) && this.f == resolutionData.f && atyq.b(this.g, resolutionData.g) && atyq.b(this.h, resolutionData.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e)), Boolean.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.J(parcel, 5, this.e, i);
        atzr.e(parcel, 6, this.f);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.c(parcel, a);
    }
}

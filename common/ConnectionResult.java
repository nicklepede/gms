package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.aqte;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.fwac;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final ConnectionResult a = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = new aqte();

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public final void a(Activity activity, int i) {
        if (b()) {
            PendingIntent pendingIntent = this.d;
            arwm.s(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean b() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.c == connectionResult.c && arwb.b(this.d, connectionResult.d) && arwb.b(this.e, connectionResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case fwac.q /* 17 */:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case fwac.t /* 20 */:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case fwac.u /* 21 */:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        case fwac.v /* 22 */:
                            str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                            break;
                        case fwac.w /* 23 */:
                            str = "API_DISABLED";
                            break;
                        case fwac.x /* 24 */:
                            str = "API_DISABLED_FOR_CONNECTION";
                            break;
                        case fwac.y /* 25 */:
                            str = "API_INSTALL_REQUIRED";
                            break;
                        default:
                            str = a.l(i, "UNKNOWN_ERROR_CODE(", ")");
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        arwa.b("statusCode", str, arrayList);
        arwa.b("resolution", this.d, arrayList);
        arwa.b("message", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.o(parcel, 1, this.b);
        arxc.o(parcel, 2, this.c);
        arxc.t(parcel, 3, this.d, i, false);
        arxc.v(parcel, 4, this.e, false);
        arxc.c(parcel, a2);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}

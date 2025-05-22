package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.asvt;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.fywe;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final ConnectionResult a = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = new asvt();

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public static String a(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case fywe.q /* 17 */:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case fywe.t /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case fywe.u /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case fywe.v /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case fywe.w /* 23 */:
                        return "API_DISABLED";
                    case fywe.x /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case fywe.y /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return a.l(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final void b(Activity activity, int i) {
        if (c()) {
            PendingIntent pendingIntent = this.d;
            atzb.s(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean c() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean d() {
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
        return this.c == connectionResult.c && atyq.b(this.d, connectionResult.d) && atyq.b(this.e, connectionResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("statusCode", a(this.c), arrayList);
        atyp.b("resolution", this.d, arrayList);
        atyp.b("message", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.o(parcel, 1, this.b);
        atzr.o(parcel, 2, this.c);
        atzr.t(parcel, 3, this.d, i, false);
        atzr.v(parcel, 4, this.e, false);
        atzr.c(parcel, a2);
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

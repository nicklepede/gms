package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import defpackage.aeno;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SecureChannelSubscription extends Subscription {
    public static final Parcelable.Creator CREATOR = new aeno();
    public final PendingIntent a;
    public final String b;
    public final int c;
    public final List d;
    public final String e;

    public SecureChannelSubscription(PendingIntent pendingIntent, String str, int i, List list, String str2) {
        atzb.s(pendingIntent);
        this.a = pendingIntent;
        atzb.s(str);
        this.b = str;
        atzb.b(!str.isEmpty());
        atzb.b(Role.f(i));
        this.c = i;
        atzb.s(list);
        this.d = list;
        atzb.b(!list.isEmpty());
        atzb.s(str2);
        this.e = str2;
        atzb.b(!str2.isEmpty());
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.gms.auth.proximity.firstparty.Subscription
    public final String b() {
        return this.e;
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                JSONObject jSONObject = new JSONObject((String) it.next());
                String string = jSONObject.getString("i");
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(new RemoteDevice(3, string, jSONObject.getString("n"), jSONObject.getString("a"), aurd.e(string), "", arrayList2, jSONObject.getString("t"), null));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecureChannelSubscription secureChannelSubscription = (SecureChannelSubscription) obj;
            if (this.a.equals(secureChannelSubscription.a) && this.b.equals(secureChannelSubscription.b) && this.c == secureChannelSubscription.c && this.d.equals(secureChannelSubscription.d) && this.e.equals(secureChannelSubscription.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        return String.format(Locale.US, "SecureChannelSubscription{mCallbackIntent=%s, mFeatureName=%s, mConnectionMode=%d, mSerializedDevices=%s, mPackageName=%s}", this.a, this.b, Integer.valueOf(this.c), this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PendingIntent pendingIntent = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, pendingIntent, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.x(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}

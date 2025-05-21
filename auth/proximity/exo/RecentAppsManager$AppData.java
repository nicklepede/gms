package com.google.android.gms.auth.proximity.exo;

import android.os.Parcelable;
import android.os.UserHandle;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import defpackage.aczy;
import defpackage.adaj;
import defpackage.febw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class RecentAppsManager$AppData implements Parcelable {
    public abstract long a();

    public abstract UserHandle b();

    public abstract ProtoParsers$ParcelableProto c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        ProtoParsers$ParcelableProto c = c();
        aczy aczyVar = c == null ? null : (aczy) c.a(aczy.a, febw.a());
        if (aczyVar == null) {
            str = "null";
        } else {
            String str2 = aczyVar.c;
            String str3 = aczyVar.d;
            int d = aczyVar.e.d();
            int hashCode = aczyVar.e.hashCode();
            long j = aczyVar.f;
            adaj adajVar = aczyVar.g;
            if (adajVar == null) {
                adajVar = adaj.a;
            }
            int i = adajVar.b;
            adaj adajVar2 = aczyVar.g;
            int i2 = (adajVar2 == null ? adaj.a : adajVar2).c;
            if (adajVar2 == null) {
                adajVar2 = adaj.a;
            }
            int i3 = adajVar2.d;
            int i4 = aczyVar.h;
            char c2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
            str = "package_name:" + str2 + ", visible_name:" + str3 + ", icon:<" + d + " bytes, hash=" + hashCode + ">, user_id:" + j + ", icon_color:" + i + "/" + i2 + "/" + i3 + ", app_streamability_status:" + (c2 == 0 ? "UNRECOGNIZED" : c2 != 2 ? c2 != 3 ? "BLOCKED_BY_APP" : "BLOCK_LISTED" : "STREAMABLE");
        }
        return "AppInfo:[" + str + "], LastTimeUsedMillis:" + a() + ", UserHandle:" + b().getIdentifier();
    }
}

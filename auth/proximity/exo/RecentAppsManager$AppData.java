package com.google.android.gms.auth.proximity.exo;

import android.os.Parcelable;
import android.os.UserHandle;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import defpackage.aezy;
import defpackage.afaj;
import defpackage.fgqp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        aezy aezyVar = c == null ? null : (aezy) c.a(aezy.a, fgqp.a());
        if (aezyVar == null) {
            str = "null";
        } else {
            String str2 = aezyVar.c;
            String str3 = aezyVar.d;
            int d = aezyVar.e.d();
            int hashCode = aezyVar.e.hashCode();
            long j = aezyVar.f;
            afaj afajVar = aezyVar.g;
            if (afajVar == null) {
                afajVar = afaj.a;
            }
            int i = afajVar.b;
            afaj afajVar2 = aezyVar.g;
            int i2 = (afajVar2 == null ? afaj.a : afajVar2).c;
            if (afajVar2 == null) {
                afajVar2 = afaj.a;
            }
            int i3 = afajVar2.d;
            int i4 = aezyVar.h;
            char c2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? (char) 0 : (char) 4 : (char) 3 : (char) 2;
            str = "package_name:" + str2 + ", visible_name:" + str3 + ", icon:<" + d + " bytes, hash=" + hashCode + ">, user_id:" + j + ", icon_color:" + i + "/" + i2 + "/" + i3 + ", app_streamability_status:" + (c2 == 0 ? "UNRECOGNIZED" : c2 != 2 ? c2 != 3 ? "BLOCKED_BY_APP" : "BLOCK_LISTED" : "STREAMABLE");
        }
        return "AppInfo:[" + str + "], LastTimeUsedMillis:" + a() + ", UserHandle:" + b().getIdentifier();
    }
}

package com.google.android.gms.auth.proximity.exo;

import android.os.UserHandle;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.auth.proximity.exo.$AutoValue_RecentAppsManager_AppData, reason: invalid class name */
/* loaded from: classes2.dex */
abstract class C$AutoValue_RecentAppsManager_AppData extends RecentAppsManager$AppData {
    public final ProtoParsers$ParcelableProto a;
    public final long b;
    public final UserHandle c;

    public C$AutoValue_RecentAppsManager_AppData(ProtoParsers$ParcelableProto protoParsers$ParcelableProto, long j, UserHandle userHandle) {
        this.a = protoParsers$ParcelableProto;
        this.b = j;
        if (userHandle == null) {
            throw new NullPointerException("Null userHandle");
        }
        this.c = userHandle;
    }

    @Override // com.google.android.gms.auth.proximity.exo.RecentAppsManager$AppData
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.gms.auth.proximity.exo.RecentAppsManager$AppData
    public final UserHandle b() {
        return this.c;
    }

    @Override // com.google.android.gms.auth.proximity.exo.RecentAppsManager$AppData
    public final ProtoParsers$ParcelableProto c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecentAppsManager$AppData) {
            RecentAppsManager$AppData recentAppsManager$AppData = (RecentAppsManager$AppData) obj;
            ProtoParsers$ParcelableProto protoParsers$ParcelableProto = this.a;
            if (protoParsers$ParcelableProto != null ? protoParsers$ParcelableProto.equals(recentAppsManager$AppData.c()) : recentAppsManager$AppData.c() == null) {
                if (this.b == recentAppsManager$AppData.a() && this.c.equals(recentAppsManager$AppData.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ProtoParsers$ParcelableProto protoParsers$ParcelableProto = this.a;
        int hashCode = protoParsers$ParcelableProto == null ? 0 : protoParsers$ParcelableProto.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }
}

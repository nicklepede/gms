package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ProfileSettingsEntity extends GamesAbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bhpo();
    public final Status a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final StockProfileImageEntity f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final ProfilelessRecallSummary o;
    public final Boolean p;

    public ProfileSettingsEntity(Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3, boolean z8, ProfilelessRecallSummary profilelessRecallSummary, Boolean bool) {
        this.a = status;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = stockProfileImageEntity;
        this.g = z4;
        this.h = z5;
        this.i = i;
        this.j = z6;
        this.k = z7;
        this.l = i2;
        this.m = i3;
        this.n = z8;
        this.o = profilelessRecallSummary;
        this.p = bool;
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ProfileSettingsEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ProfileSettingsEntity profileSettingsEntity = (ProfileSettingsEntity) obj;
        if (arwb.b(this.b, profileSettingsEntity.b)) {
            if (arwb.b(Boolean.valueOf(this.c), Boolean.valueOf(profileSettingsEntity.c))) {
                if (arwb.b(Boolean.valueOf(this.d), Boolean.valueOf(profileSettingsEntity.d))) {
                    if (arwb.b(Boolean.valueOf(this.e), Boolean.valueOf(profileSettingsEntity.e)) && arwb.b(this.a, profileSettingsEntity.a) && arwb.b(this.f, profileSettingsEntity.f)) {
                        if (arwb.b(Boolean.valueOf(this.g), Boolean.valueOf(profileSettingsEntity.g))) {
                            if (arwb.b(Boolean.valueOf(this.h), Boolean.valueOf(profileSettingsEntity.h)) && this.i == profileSettingsEntity.i && this.j == profileSettingsEntity.j && this.k == profileSettingsEntity.k && this.l == profileSettingsEntity.l && this.m == profileSettingsEntity.m && this.n == profileSettingsEntity.n && arwb.b(this.p, profileSettingsEntity.p) && arwb.b(this.o, profileSettingsEntity.o)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.a, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Boolean.valueOf(this.n), this.o, this.p});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("GamerTag", this.b, arrayList);
        arwa.b("IsGamerTagExplicitlySet", Boolean.valueOf(this.c), arrayList);
        arwa.b("IsProfileVisible", Boolean.valueOf(this.d), arrayList);
        arwa.b("IsVisibilityExplicitlySet", Boolean.valueOf(this.e), arrayList);
        arwa.b("Status", this.a, arrayList);
        arwa.b("StockProfileImage", this.f, arrayList);
        arwa.b("IsProfileDiscoverable", Boolean.valueOf(this.g), arrayList);
        arwa.b("AutoSignIn", Boolean.valueOf(this.h), arrayList);
        arwa.b("httpErrorCode", Integer.valueOf(this.i), arrayList);
        arwa.b("IsSettingsChangesProhibited", Boolean.valueOf(this.j), arrayList);
        arwa.b("AllowFriendInvites", Boolean.valueOf(this.k), arrayList);
        arwa.b("ProfileVisibility", Integer.valueOf(this.l), arrayList);
        arwa.b("global_friends_list_visibility", Integer.valueOf(this.m), arrayList);
        arwa.b("always_auto_sign_in", Boolean.valueOf(this.n), arrayList);
        arwa.b("profileless_recall_summary", this.o, arrayList);
        arwa.b("games_streaks_enabled", this.p, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, status, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.e(parcel, 3, this.c);
        arxc.e(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.o(parcel, 9, this.i);
        arxc.e(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.o(parcel, 12, this.l);
        arxc.o(parcel, 13, this.m);
        arxc.e(parcel, 14, this.n);
        arxc.t(parcel, 15, this.o, i, false);
        arxc.z(parcel, 16, this.p);
        arxc.c(parcel, a);
    }
}

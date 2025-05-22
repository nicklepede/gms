package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.ekvk;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class MusicAlbum extends Thing {
    public final MusicGroup a;
    public final String b;
    public final long c;
    public final List d;

    public MusicAlbum(String str, String str2, String str3, List list, List list2, MusicGroup musicGroup, String str4, long j, List list3, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        List list4;
        this.a = musicGroup;
        this.b = ekvk.b(str4);
        this.c = j;
        if (list3 != null) {
            list4 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list4 = elpg.a;
        }
        this.d = list4;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (!(obj instanceof MusicAlbum) || !super.equals(obj)) {
            return false;
        }
        MusicAlbum musicAlbum = (MusicAlbum) obj;
        return Objects.equals(this.a, musicAlbum.a) && Objects.equals(this.b, musicAlbum.b) && this.c == musicAlbum.c && Objects.equals(this.d, musicAlbum.d);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, this.b, Long.valueOf(this.c), this.d, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.d;
        MusicGroup musicGroup = this.a;
        return "MusicAlbum{'" + super.toString() + "', musicGroup=" + String.valueOf(musicGroup) + ", image='" + this.b + "', numTracks=" + this.c + ", tracks=" + String.valueOf(list) + "}";
    }
}

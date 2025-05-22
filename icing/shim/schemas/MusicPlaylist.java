package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class MusicPlaylist extends Thing {
    public final List a;

    public MusicPlaylist(String str, String str2, String str3, List list, List list2, List list3, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        List list4;
        if (list3 != null) {
            list4 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list4 = elpg.a;
        }
        this.a = list4;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if ((obj instanceof MusicPlaylist) && super.equals(obj)) {
            return Objects.equals(this.a, ((MusicPlaylist) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.a;
        return "MusicPlaylist{'" + super.toString() + "', tracks=" + String.valueOf(list) + "}";
    }
}

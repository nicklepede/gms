package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class MusicGroup extends Thing {
    public final List a;
    public final List b;

    public MusicGroup(String str, String str2, String str3, List list, List list2, List list3, List list4, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        List list5;
        List list6;
        if (list3 != null) {
            list5 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list5 = elpg.a;
        }
        this.a = list5;
        if (list4 != null) {
            list6 = DesugarCollections.unmodifiableList(list4);
        } else {
            int i2 = elgo.d;
            list6 = elpg.a;
        }
        this.b = list6;
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (!(obj instanceof MusicGroup) || !super.equals(obj)) {
            return false;
        }
        MusicGroup musicGroup = (MusicGroup) obj;
        return Objects.equals(this.a, musicGroup.a) && Objects.equals(this.b, musicGroup.b);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.b;
        List list2 = this.a;
        return "MusicGroup{'" + super.toString() + "', tracks=" + String.valueOf(list2) + ", albums=" + String.valueOf(list) + "}";
    }
}

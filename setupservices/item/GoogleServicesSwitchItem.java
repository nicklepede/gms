package com.google.android.gms.setupservices.item;

import com.google.android.gms.R;
import com.google.android.setupdesign.items.SwitchItem;
import defpackage.deoe;
import defpackage.deos;
import defpackage.depj;
import defpackage.evnn;
import defpackage.evnr;
import defpackage.evnu;
import defpackage.evog;
import defpackage.evoh;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GoogleServicesSwitchItem extends SwitchItem implements deoe {
    public deos a;
    public deos b;

    @Override // defpackage.deoe
    public final int c() {
        return R.id.section_device_maintenance;
    }

    @Override // defpackage.deoe
    public final depj i() {
        fgrc v = evnn.a.v();
        fgrc v2 = evoh.a.v();
        evog evogVar = this.o ? evog.ENABLED : evog.DISABLED;
        if (!v2.b.L()) {
            v2.U();
        }
        evoh evohVar = (evoh) v2.b;
        evohVar.c = evogVar.d;
        evohVar.b |= 1;
        evoh evohVar2 = (evoh) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        evnn evnnVar = (evnn) v.b;
        evohVar2.getClass();
        evnnVar.d = evohVar2;
        evnnVar.b |= 2;
        fgrc v3 = evnu.a.v();
        deos deosVar = this.a;
        if (deosVar != null) {
            evnr d = deosVar.d();
            if (!v3.b.L()) {
                v3.U();
            }
            evnu evnuVar = (evnu) v3.b;
            d.getClass();
            evnuVar.d = d;
            evnuVar.b |= 2;
        }
        deos deosVar2 = this.b;
        if (deosVar2 != null) {
            evnr d2 = deosVar2.d();
            if (!v3.b.L()) {
                v3.U();
            }
            evnu evnuVar2 = (evnu) v3.b;
            d2.getClass();
            evnuVar2.e = d2;
            evnuVar2.b |= 4;
        }
        return new depj((evnn) v.Q(), (evnu) v3.Q());
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence jN() {
        deos deosVar = this.b;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence l() {
        deos deosVar = this.a;
        if (deosVar == null) {
            return null;
        }
        return deosVar.a;
    }
}

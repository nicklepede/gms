package com.google.android.gms.setupservices.item;

import com.google.android.gms.R;
import com.google.android.setupdesign.items.SwitchItem;
import defpackage.dcdy;
import defpackage.dcem;
import defpackage.dcfd;
import defpackage.esxx;
import defpackage.esyb;
import defpackage.esye;
import defpackage.esyq;
import defpackage.esyr;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GoogleServicesSwitchItem extends SwitchItem implements dcdy {
    public dcem a;
    public dcem b;

    @Override // defpackage.dcdy
    public final int c() {
        return R.id.section_device_maintenance;
    }

    @Override // defpackage.dcdy
    public final dcfd i() {
        fecj v = esxx.a.v();
        fecj v2 = esyr.a.v();
        esyq esyqVar = this.o ? esyq.ENABLED : esyq.DISABLED;
        if (!v2.b.L()) {
            v2.U();
        }
        esyr esyrVar = (esyr) v2.b;
        esyrVar.c = esyqVar.d;
        esyrVar.b |= 1;
        esyr esyrVar2 = (esyr) v2.Q();
        if (!v.b.L()) {
            v.U();
        }
        esxx esxxVar = (esxx) v.b;
        esyrVar2.getClass();
        esxxVar.d = esyrVar2;
        esxxVar.b |= 2;
        fecj v3 = esye.a.v();
        dcem dcemVar = this.a;
        if (dcemVar != null) {
            esyb d = dcemVar.d();
            if (!v3.b.L()) {
                v3.U();
            }
            esye esyeVar = (esye) v3.b;
            d.getClass();
            esyeVar.d = d;
            esyeVar.b |= 2;
        }
        dcem dcemVar2 = this.b;
        if (dcemVar2 != null) {
            esyb d2 = dcemVar2.d();
            if (!v3.b.L()) {
                v3.U();
            }
            esye esyeVar2 = (esye) v3.b;
            d2.getClass();
            esyeVar2.e = d2;
            esyeVar2.b |= 4;
        }
        return new dcfd((esxx) v.Q(), (esye) v3.Q());
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence jx() {
        dcem dcemVar = this.b;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }

    @Override // com.google.android.setupdesign.items.Item
    public final CharSequence l() {
        dcem dcemVar = this.a;
        if (dcemVar == null) {
            return null;
        }
        return dcemVar.a;
    }
}

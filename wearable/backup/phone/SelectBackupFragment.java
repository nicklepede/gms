package com.google.android.gms.wearable.backup.phone;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.SelectBackupFragment;
import defpackage.dg;
import defpackage.dmae;
import defpackage.dmaf;
import defpackage.dmca;
import defpackage.dmmw;
import defpackage.ekvl;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.qx;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SelectBackupFragment extends dg {
    private dmca a = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (dmca) new jxw((RestoreFlowChimeraActivity) context).a(dmca.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dmmw.e(getArguments());
        LayoutInflater c = dmmw.c(e, layoutInflater);
        View inflate = c.inflate(true != dmmw.h(e) ? R.layout.companion_restore_select_backup_fragment : R.layout.companion_restore_expressive_select_backup_fragment, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.cancel_action);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.backup_devices);
        final dmca dmcaVar = this.a;
        ekvl.y(dmcaVar);
        final dmae dmaeVar = new dmae(e);
        qx qxVar = new qx(new dmaf(e), dmaeVar);
        button.setOnClickListener(new View.OnClickListener() { // from class: dmcc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dmca.this.h(2);
            }
        });
        c.getContext();
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ah(qxVar);
        Objects.requireNonNull(dmaeVar);
        dmcaVar.g.g(this, new jvs() { // from class: dmcd
            @Override // defpackage.jvs
            public final void a(Object obj) {
                List list = (List) obj;
                dmae.a.h(String.format(Locale.getDefault(), "Setting %d devices", Integer.valueOf(list.size())), new Object[0]);
                dmae dmaeVar2 = dmae.this;
                dmaeVar2.e = list;
                dmaeVar2.o();
            }
        });
        final jvr jvrVar = dmaeVar.f;
        jvrVar.g(this, new jvs() { // from class: dmce
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ajjm ajjmVar = (ajjm) obj;
                jvrVar.k(SelectBackupFragment.this);
                dmca.a.h("Selecting device ".concat(String.valueOf(ajjmVar.e)), new Object[0]);
                final dmca dmcaVar2 = dmcaVar;
                dmcaVar2.i.l(ajjmVar);
                if (!dmcaVar2.f) {
                    dmcaVar2.b(dmbz.BACKUP_SELECTED);
                    return;
                }
                dhlw d = dmcaVar2.d.d(dmcaVar2.e, dmbz.BACKUP_SELECTED.ordinal(), ajjmVar.r());
                d.z(new dhlq() { // from class: dmbn
                    @Override // defpackage.dhlq
                    public final void gC(Object obj2) {
                        dmca dmcaVar3 = dmca.this;
                        dmcaVar3.g(7);
                        dmcaVar3.b(dmbz.FINISH);
                    }
                });
                d.y(new dhln() { // from class: dmbo
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        dmca.a.g("Failed to save current state and backup data to WearBackupService", exc, new Object[0]);
                        dmca.this.b(dmbz.BACKUP_SELECTED);
                    }
                });
            }
        });
        return inflate;
    }
}

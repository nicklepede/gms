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
import defpackage.djol;
import defpackage.djom;
import defpackage.djqh;
import defpackage.dkbd;
import defpackage.eiig;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qs;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SelectBackupFragment extends dg {
    private djqh a = null;

    @Override // defpackage.dg
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = (djqh) new jrh((RestoreFlowChimeraActivity) context).a(djqh.class);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppTheme e = dkbd.e(getArguments());
        LayoutInflater c = dkbd.c(e, layoutInflater);
        View inflate = c.inflate(true != dkbd.h(e) ? R.layout.companion_restore_select_backup_fragment : R.layout.companion_restore_expressive_select_backup_fragment, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.cancel_action);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.backup_devices);
        final djqh djqhVar = this.a;
        eiig.x(djqhVar);
        final djol djolVar = new djol(e);
        qs qsVar = new qs(new djom(e), djolVar);
        button.setOnClickListener(new View.OnClickListener() { // from class: djqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                djqh.this.h(2);
            }
        });
        c.getContext();
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ah(qsVar);
        Objects.requireNonNull(djolVar);
        djqhVar.g.g(this, new jpd() { // from class: djqk
            @Override // defpackage.jpd
            public final void a(Object obj) {
                List list = (List) obj;
                djol.a.h(String.format(Locale.getDefault(), "Setting %d devices", Integer.valueOf(list.size())), new Object[0]);
                djol djolVar2 = djol.this;
                djolVar2.e = list;
                djolVar2.o();
            }
        });
        final jpc jpcVar = djolVar.f;
        jpcVar.g(this, new jpd() { // from class: djql
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ahiw ahiwVar = (ahiw) obj;
                jpcVar.k(SelectBackupFragment.this);
                djqh.a.h("Selecting device ".concat(String.valueOf(ahiwVar.e)), new Object[0]);
                final djqh djqhVar2 = djqhVar;
                djqhVar2.i.l(ahiwVar);
                if (!djqhVar2.f) {
                    djqhVar2.b(djqg.BACKUP_SELECTED);
                    return;
                }
                dfaq d = djqhVar2.d.d(djqhVar2.e, djqg.BACKUP_SELECTED.ordinal(), ahiwVar.r());
                d.z(new dfak() { // from class: djpu
                    @Override // defpackage.dfak
                    public final void gn(Object obj2) {
                        djqh djqhVar3 = djqh.this;
                        djqhVar3.g(7);
                        djqhVar3.b(djqg.FINISH);
                    }
                });
                d.y(new dfah() { // from class: djpv
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        djqh.a.g("Failed to save current state and backup data to WearBackupService", exc, new Object[0]);
                        djqh.this.b(djqg.BACKUP_SELECTED);
                    }
                });
            }
        });
        return inflate;
    }
}

package com.google.android.gms.fido.fido2.ui.hybrid;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.fido.fido2.ui.hybrid.LinkedDevicesSettingsChimeraActivity;
import defpackage.atzb;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auub;
import defpackage.beej;
import defpackage.belt;
import defpackage.beov;
import defpackage.edxt;
import defpackage.ekut;
import defpackage.eles;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.fqrg;
import defpackage.ig;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.ryb;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class LinkedDevicesSettingsChimeraActivity extends ryb {
    public static final ausn h = beov.d("LinkedDevicesSettingsFragment");
    public final eqgo i = new aupz(2, 9);
    public boolean j = false;
    private RecyclerView k;
    private TextView l;
    private TextView m;
    private FrameLayout n;
    private TextView o;
    private TextView p;
    private LinearLayout q;
    private beej r;

    public final void j(List list) {
        atzb.g();
        this.r.C(eles.j(list).l(new ekut() { // from class: belq
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = LinkedDevicesSettingsChimeraActivity.h;
                return beef.a(((beao) obj).e, null, JGCastService.FLAG_USE_TDLS, null, "0", 3);
            }
        }).n());
        if (list.isEmpty()) {
            if (!this.j) {
                this.l.setVisibility(0);
                this.k.setVisibility(8);
                return;
            }
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            this.p.setVisibility(0);
            this.p.setText(R.string.fido_hybrid_devices_empty_header);
            this.q.setVisibility(8);
            return;
        }
        if (!this.j) {
            this.l.setVisibility(8);
            this.k.setVisibility(0);
            return;
        }
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.p.setVisibility(0);
        this.p.setText(R.string.fido_hybrid_devices_header);
        this.q.setVisibility(0);
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean c = fqrg.c();
        this.j = c;
        if (c) {
            setTheme(R.style.Theme_Fido_Settings);
            getContainerActivity();
            int i = edxt.a;
        } else {
            setTheme(R.style.Theme_Fido_Settings_Legacy);
            if (!auub.c()) {
                setTheme(R.style.Theme_Fido_Settings_Legacy);
            }
        }
        setContentView(R.layout.fido_linked_devices_settings);
        if (this.j) {
            setTitle(R.string.fido_hybrid_linked_devices_google_settings_title);
        } else {
            setTitle(R.string.fido_linked_devices_settings_title);
        }
        if (fqrg.a.lK().d()) {
            View decorView = getWindow().getDecorView();
            iuz iuzVar = new iuz() { // from class: belo
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    ausn ausnVar = LinkedDevicesSettingsChimeraActivity.h;
                    view.setPadding(0, ixtVar.f(1).c, 0, ixtVar.f(64).e);
                    return ixt.a;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(decorView, iuzVar);
        }
        ig jR = jR();
        if (jR != null) {
            if (this.j) {
                jR.z(R.string.fido_hybrid_linked_devices_google_settings_title);
            } else {
                jR.z(R.string.fido_linked_devices_settings_title);
            }
            jR.o(true);
        }
        TextView textView = (TextView) findViewById(R.id.clear_description);
        textView.setText(String.format(getString(R.string.fido_clear_links_description), getString(R.string.fido_clear)));
        this.l = (TextView) findViewById(R.id.empty_container_text);
        Button button = (Button) findViewById(R.id.clear_btn);
        this.m = (TextView) findViewById(R.id.clear_title);
        if (this.j) {
            findViewById(R.id.devices_title).setVisibility(8);
            findViewById(R.id.devices_description).setVisibility(8);
            textView.setVisibility(8);
            this.m.setVisibility(8);
            this.l.setVisibility(8);
            this.n = (FrameLayout) findViewById(R.id.material_shape_container);
            this.q = (LinearLayout) findViewById(R.id.list_linear_layout);
            this.p = (TextView) findViewById(R.id.hybrid_settings_header);
            this.o = (TextView) findViewById(R.id.empty_list_description);
            findViewById(R.id.fido_info_footer).setVisibility(0);
            button.setVisibility(8);
            button = (Button) findViewById(R.id.clear_button);
            button.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_container);
        this.k = recyclerView;
        recyclerView.aj(new LinearLayoutManager());
        if (this.j) {
            this.r = new beej(R.layout.fido_hybrid_linked_devices_row_layout, null);
        } else {
            this.r = new beej(R.layout.fido_linked_devices_row_layout, null);
        }
        this.k.ah(this.r);
        button.setOnClickListener(new View.OnClickListener() { // from class: belp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity = LinkedDevicesSettingsChimeraActivity.this;
                if (linkedDevicesSettingsChimeraActivity.j) {
                    edzp edzpVar = new edzp(linkedDevicesSettingsChimeraActivity);
                    edzpVar.N(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_hybrid_clear_devices_title));
                    edzpVar.C(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_hybrid_clear_devices_body));
                    edzpVar.K(R.string.fido_delete_connections, new DialogInterface.OnClickListener() { // from class: belj
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity2 = LinkedDevicesSettingsChimeraActivity.this;
                            linkedDevicesSettingsChimeraActivity2.i.execute(new beli(linkedDevicesSettingsChimeraActivity2));
                        }
                    });
                    edzpVar.E(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: belk
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ausn ausnVar = LinkedDevicesSettingsChimeraActivity.h;
                            dialogInterface.dismiss();
                        }
                    });
                    edzpVar.a();
                    return;
                }
                ip ipVar = new ip(linkedDevicesSettingsChimeraActivity);
                ipVar.setTitle(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_clear_devices_confirm_title));
                ipVar.p(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_clear_devices_confirm_body));
                ipVar.setPositiveButton(R.string.common_yes, new DialogInterface.OnClickListener() { // from class: bell
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity2 = LinkedDevicesSettingsChimeraActivity.this;
                        linkedDevicesSettingsChimeraActivity2.i.execute(new beli(linkedDevicesSettingsChimeraActivity2));
                    }
                });
                ipVar.setNegativeButton(R.string.common_no, new DialogInterface.OnClickListener() { // from class: belm
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ausn ausnVar = LinkedDevicesSettingsChimeraActivity.h;
                        dialogInterface.dismiss();
                    }
                });
                ipVar.a();
            }
        });
        eqgo eqgoVar = this.i;
        eqgc.t(eqgoVar.submit(new Callable() { // from class: belr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return beam.d();
            }
        }), new belt(this), eqgoVar);
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}

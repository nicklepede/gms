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
import defpackage.arwm;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bccp;
import defpackage.bcki;
import defpackage.bcni;
import defpackage.eble;
import defpackage.eiho;
import defpackage.eirn;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.fnze;
import defpackage.ig;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.qex;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LinkedDevicesSettingsChimeraActivity extends qex {
    public static final asot h = bcni.d("LinkedDevicesSettingsFragment");
    public final ensv i = new asmf(2, 9);
    public boolean j = false;
    private RecyclerView k;
    private TextView l;
    private TextView m;
    private FrameLayout n;
    private TextView o;
    private TextView p;
    private LinearLayout q;
    private bccp r;

    public final void j(List list) {
        arwm.g();
        this.r.C(eirn.j(list).l(new eiho() { // from class: bckf
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = LinkedDevicesSettingsChimeraActivity.h;
                return bccl.a(((bbww) obj).e, null, JGCastService.FLAG_USE_TDLS, null, "0", 3);
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

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean c = fnze.c();
        this.j = c;
        if (c) {
            setTheme(R.style.Theme_Fido_Settings);
            getContainerActivity();
            int i = eble.a;
        } else {
            setTheme(R.style.Theme_Fido_Settings_Legacy);
            if (!asqh.c()) {
                setTheme(R.style.Theme_Fido_Settings_Legacy);
            }
        }
        setContentView(R.layout.fido_linked_devices_settings);
        if (this.j) {
            setTitle(R.string.fido_hybrid_linked_devices_google_settings_title);
        } else {
            setTitle(R.string.fido_linked_devices_settings_title);
        }
        if (fnze.a.a().d()) {
            View decorView = getWindow().getDecorView();
            itj itjVar = new itj() { // from class: bckd
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    asot asotVar = LinkedDevicesSettingsChimeraActivity.h;
                    view.setPadding(0, iwdVar.f(1).c, 0, iwdVar.f(64).e);
                    return iwd.a;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(decorView, itjVar);
        }
        ig jB = jB();
        if (jB != null) {
            if (this.j) {
                jB.z(R.string.fido_hybrid_linked_devices_google_settings_title);
            } else {
                jB.z(R.string.fido_linked_devices_settings_title);
            }
            jB.o(true);
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
            this.r = new bccp(R.layout.fido_hybrid_linked_devices_row_layout, null);
        } else {
            this.r = new bccp(R.layout.fido_linked_devices_row_layout, null);
        }
        this.k.ah(this.r);
        button.setOnClickListener(new View.OnClickListener() { // from class: bcke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity = LinkedDevicesSettingsChimeraActivity.this;
                if (linkedDevicesSettingsChimeraActivity.j) {
                    ebna ebnaVar = new ebna(linkedDevicesSettingsChimeraActivity);
                    ebnaVar.N(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_hybrid_clear_devices_title));
                    ebnaVar.C(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_hybrid_clear_devices_body));
                    ebnaVar.K(R.string.fido_delete_connections, new DialogInterface.OnClickListener() { // from class: bcjy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity2 = LinkedDevicesSettingsChimeraActivity.this;
                            linkedDevicesSettingsChimeraActivity2.i.execute(new bcjx(linkedDevicesSettingsChimeraActivity2));
                        }
                    });
                    ebnaVar.E(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: bcjz
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            asot asotVar = LinkedDevicesSettingsChimeraActivity.h;
                            dialogInterface.dismiss();
                        }
                    });
                    ebnaVar.a();
                    return;
                }
                ip ipVar = new ip(linkedDevicesSettingsChimeraActivity);
                ipVar.setTitle(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_clear_devices_confirm_title));
                ipVar.n(linkedDevicesSettingsChimeraActivity.getString(R.string.fido_clear_devices_confirm_body));
                ipVar.setPositiveButton(R.string.common_yes, new DialogInterface.OnClickListener() { // from class: bcka
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        LinkedDevicesSettingsChimeraActivity linkedDevicesSettingsChimeraActivity2 = LinkedDevicesSettingsChimeraActivity.this;
                        linkedDevicesSettingsChimeraActivity2.i.execute(new bcjx(linkedDevicesSettingsChimeraActivity2));
                    }
                });
                ipVar.setNegativeButton(R.string.common_no, new DialogInterface.OnClickListener() { // from class: bckb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        asot asotVar = LinkedDevicesSettingsChimeraActivity.h;
                        dialogInterface.dismiss();
                    }
                });
                ipVar.a();
            }
        });
        ensv ensvVar = this.i;
        ensj.t(ensvVar.submit(new Callable() { // from class: bckg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return bbwu.d();
            }
        }), new bcki(this), ensvVar);
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
